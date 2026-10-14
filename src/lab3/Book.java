package lab3;

import java.util.ArrayList;
import java.util.List;

public class Book extends Section {
    private final List<Author> authors = new ArrayList<>();

    public Book(String title) { super(title); }

    public void addAuthor(Author a) { authors.add(a); }

    public void addContent(Element e) { add(e); }

    @Override
    public void render() {
        System.out.println("Book: " + getTitle());
        for (Author a : authors) {
            a.print();
        }
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Element e : children) {
            e.accept(visitor);
        }
    }
}
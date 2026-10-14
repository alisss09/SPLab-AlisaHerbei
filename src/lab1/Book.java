package lab1;

import java.util.ArrayList;
import java.util.List;

public class Book extends Section {
    private final List<Author> authors = new ArrayList<>();
    private TableOfContents tableOfContents;

    public Book(String title) {
        super(title);
    }

    public void addAuthor(Author a) {
        authors.add(a);
    }

    public void addContent(Element e) {
        add(e);
    }

    public void setTableOfContents(TableOfContents toc) {
        this.tableOfContents = toc;
    }

    @Override
    public void print() {
        System.out.println("Book: " + getTitle());
        System.out.println("Authors:");
        for (Author a : authors) {
            a.print();
        }
        printChildren();
    }
}
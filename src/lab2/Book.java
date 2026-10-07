package lab2;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private final List<Author> authors = new ArrayList<>();
    private final List<Element> elements = new ArrayList<>();

    public void addAuthor(Author a) {
        authors.add(a);
    }

    public void addContent(Element e) {
        elements.add(e);
    }

    public void print() {
        for (Author a : authors) {
            a.print();
        }
        for (Element e : elements) {
            e.print();
        }
    }
}
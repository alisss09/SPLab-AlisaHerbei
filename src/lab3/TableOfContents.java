package lab3;

import java.util.ArrayList;
import java.util.List;

public class TableOfContents implements Element {
    private final List<String> entries = new ArrayList<>();

    public void addEntry(String entry) { entries.add(entry); }

    public void render() {
        System.out.println("Table of Contents");
        for (String entry : entries) {
            System.out.println("  " + entry);
        }
    }

    @Override public void accept(Visitor visitor) { visitor.visit(this); }
    @Override public void add(Element e) { throw new UnsupportedOperationException(); }
    @Override public void remove(Element e) { throw new UnsupportedOperationException(); }
    @Override public Element get(int index) { throw new UnsupportedOperationException(); }
}
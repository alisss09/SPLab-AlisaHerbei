package lab1;

import java.util.ArrayList;
import java.util.List;

public class Section extends Element {
    private final String title;
    private final List<Element> children = new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void add(Element e) {
        if (e.getParent() != null) {
            throw new IllegalStateException("Element already belongs to a section");
        }
        e.setParent(this);
        children.add(e);
    }

    @Override
    public void remove(Element e) {
        if (children.remove(e)) {
            e.setParent(null);
        }
    }

    @Override
    public Element get(int index) {
        return children.get(index);
    }

    protected void printChildren() {
        for (Element e : children) {
            e.print();
        }
    }

    @Override
    public void print() {
        System.out.println(title);
        printChildren();
    }
}
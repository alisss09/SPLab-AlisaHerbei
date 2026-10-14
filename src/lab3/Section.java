package lab3;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
    private final String title;
    protected final List<Element> children = new ArrayList<>();

    public Section(String title) { this.title = title; }

    public String getTitle() { return title; }

    public void render() { System.out.println(title); }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
        for (Element e : children) {
            e.accept(visitor);
        }
    }

    @Override public void add(Element e) { children.add(e); }
    @Override public void remove(Element e) { children.remove(e); }
    @Override public Element get(int index) { return children.get(index); }
}
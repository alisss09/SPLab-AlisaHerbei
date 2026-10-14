package lab3;

public class Table implements Element {
    private final String name;

    public Table(String name) { this.name = name; }

    public void render() { System.out.println("Table: " + name); }

    @Override public void accept(Visitor visitor) { visitor.visit(this); }
    @Override public void add(Element e) { throw new UnsupportedOperationException(); }
    @Override public void remove(Element e) { throw new UnsupportedOperationException(); }
    @Override public Element get(int index) { throw new UnsupportedOperationException(); }
}
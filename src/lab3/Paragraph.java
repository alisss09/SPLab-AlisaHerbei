package lab3;

public class Paragraph implements Element {
    private final String text;
    private AlignStrategy textAlignment;

    public Paragraph(String text) { this.text = text; }

    public String getText() { return text; }

    public void setAlignStrategy(AlignStrategy strategy) { this.textAlignment = strategy; }

    public void render() {
        if (textAlignment == null) {
            System.out.println(text);
        } else {
            textAlignment.render(this, new Context(40));
        }
    }

    @Override public void accept(Visitor visitor) { visitor.visit(this); }
    @Override public void add(Element e) { throw new UnsupportedOperationException(); }
    @Override public void remove(Element e) { throw new UnsupportedOperationException(); }
    @Override public Element get(int index) { throw new UnsupportedOperationException(); }
}
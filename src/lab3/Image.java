package lab3;

import java.awt.Dimension;
import java.util.concurrent.TimeUnit;

public class Image implements Element, Picture {
    private final String url;
    private final Dimension dim = new Dimension(800, 600);
    private final ImageContent content;

    public Image(String name) {
        this.url = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.content = new ImageContent(name);
    }

    @Override public String url() { return url; }
    @Override public Dimension dim() { return dim; }
    @Override public ImageContent content() { return content; }

    public void render() { System.out.println("Image: " + url); }

    @Override public void accept(Visitor visitor) { visitor.visit(this); }
    @Override public void add(Element e) { throw new UnsupportedOperationException(); }
    @Override public void remove(Element e) { throw new UnsupportedOperationException(); }
    @Override public Element get(int index) { throw new UnsupportedOperationException(); }
}
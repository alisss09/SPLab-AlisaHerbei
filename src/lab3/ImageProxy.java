package lab3;

import java.awt.Dimension;

public class ImageProxy implements Element, Picture {
    private final String url;
    private final Dimension dim = new Dimension(800, 600);
    private Image realImage;

    public ImageProxy(String url) { this.url = url; }

    private Image loadImage() {
        if (realImage == null) {
            realImage = new Image(url);
        }
        return realImage;
    }

    @Override public String url() { return url; }
    @Override public Dimension dim() { return dim; }
    @Override public ImageContent content() { return loadImage().content(); }

    public void render() { loadImage().render(); }

    @Override public void accept(Visitor visitor) { visitor.visit(this); }
    @Override public void add(Element e) { throw new UnsupportedOperationException(); }
    @Override public void remove(Element e) { throw new UnsupportedOperationException(); }
    @Override public Element get(int index) { throw new UnsupportedOperationException(); }
}
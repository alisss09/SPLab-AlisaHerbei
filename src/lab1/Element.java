package lab1;

public abstract class Element {
    private Section parent;

    public Section getParent() {
        return parent;
    }

    void setParent(Section parent) {
        this.parent = parent;
    }

    public abstract void print();

    public void add(Element e) {
        throw new UnsupportedOperationException();
    }

    public void remove(Element e) {
        throw new UnsupportedOperationException();
    }

    public Element get(int index) {
        throw new UnsupportedOperationException();
    }
}
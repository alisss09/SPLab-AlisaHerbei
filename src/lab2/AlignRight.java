package lab2;

public class AlignRight implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph, Context context) {
        int pad = Math.max(0, context.getWidth() - paragraph.getText().length());
        System.out.println(" ".repeat(pad) + paragraph.getText());
    }
}
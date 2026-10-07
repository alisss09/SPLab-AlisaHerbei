package lab2;

public class AlignCenter implements AlignStrategy {
    @Override
    public void render(Paragraph paragraph, Context context) {
        int pad = Math.max(0, (context.getWidth() - paragraph.getText().length()) / 2);
        System.out.println(" ".repeat(pad) + paragraph.getText());
    }
}
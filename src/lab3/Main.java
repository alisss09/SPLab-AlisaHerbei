package lab3;

public class Main {
    public static void main(String[] args) throws Exception {
        Section cap1 = new Section("Capitolul 1");
        Paragraph p1 = new Paragraph("Paragraph 1");
        cap1.add(p1);
        Paragraph p2 = new Paragraph("Paragraph 2");
        cap1.add(p2);
        Paragraph p3 = new Paragraph("Paragraph 3");
        cap1.add(p3);
        Paragraph p4 = new Paragraph("Paragraph 4");
        cap1.add(p4);
        cap1.add(new ImageProxy("ImageOne"));
        cap1.add(new Image("ImageTwo"));
        cap1.add(new Paragraph("Some text"));
        cap1.add(new Table("Table 1"));

        BookStatistics stats = new BookStatistics();
        cap1.accept(stats);
        stats.printStatistics();

        // Extra: render the whole book and generate the table of contents
        p1.setAlignStrategy(new AlignCenter());
        p2.setAlignStrategy(new AlignRight());
        Section cap2 = new Section("Capitolul 2");
        cap2.add(new Paragraph("Text in chapter 2"));

        Book myBook = new Book("My Book");
        myBook.addAuthor(new Author("Alisa", "Herbei"));
        myBook.addContent(cap1);
        myBook.addContent(cap2);

        System.out.println();
        myBook.accept(new RenderContentVisitor());

        GenerateToC toc = new GenerateToC();
        myBook.accept(toc);
        System.out.println();
        toc.getToC().render();
    }
}
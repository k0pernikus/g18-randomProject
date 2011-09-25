package randomproject;

/**
 * @author Philipp Kretzschmar <philipp.kretzschmar@gmail.com>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TextDecorator[] TextDecos = new TextDecorator[3];

        TextDecos[0] = new HTML();
        TextDecos[1] = new PlainText();
        TextDecos[2] = new WikiText();

        for (TextDecorator textDecorator : TextDecos) {
            Out.put(textDecorator.getTextDescription());
            Out.put(textDecorator.bold("Foobar"));
            Out.put(textDecorator.italics("Foobar"));
            Out.put(textDecorator.underline("Foobar"));
            Out.put("================================");
        }
    }


    static class Out {
        public static void put(String string) {
            System.out.println(string);
        }
    }
}

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
            Out.put(textDecorator.bold("Ich bin fett."));
            Out.put(textDecorator.italics("Ich bin schräg."));
            Out.put(textDecorator.underline("Ich steh auf'm Schlauch."));
            Out.put("================================");
        }
    }

    static  class Out {
        public static void put(String string) {
            System.out.println(string);
        }
    }
}
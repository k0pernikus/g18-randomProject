package randomproject;
/**
 * @author Philipp Kretzschmar <philipp.kretzschmar@gmail.com>
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Out.put(new PlainText().bold("Foobar"));
        Out.put(new HTML().bold("Foobar"));
        Out.put(new WikiText().bold("Foobar"));
    }

    static class Out {
        public static void put(String string) {
            System.out.println(string);
        }
    }
}
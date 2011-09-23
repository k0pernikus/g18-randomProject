package randomproject;
/**
 * @author Philipp Kretzschmar <philipp.kretzschmar@gmail.com>
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Output o = new Output();
        
        System.out.println(new PlainText().bold("Foobar"));
    }

    class Output {
        public void pln(String string) {
            System.out.println(string);
        }
    }
}
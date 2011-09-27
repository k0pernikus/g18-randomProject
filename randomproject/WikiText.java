package randomproject;

/**
 * @author Philipp Kretzschmar
 */
public class WikiText extends TextDecorator {

    @Override
    public String getTextDescription() {
        return "WikiText";
    }

    public String bold(String string) {
        return wrap("'''", string);
    }

    public String italics(String string) {
        return wrap("''", string);
    }

    public String underline(String string) {
        // anonymer aufruf der HTML.underlinde-Methode
        // da gleiche Implementation
        return new HTML().underline(string);
    }
}
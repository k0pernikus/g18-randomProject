package randomproject;

/**
 * @author Philipp Kretzschmar
 */
public class HTML extends TextDecorator {
    @Override
    public String getTextDescription() {
        return "HTML";
    }

    public String bold(String string) {
        return wrap("<b>", "</b>", string);
    }

    public String italics(String string) {
        return wrap("<i>", "</i>", string);
    }

    public String underline(String string) {
        return wrap("<u>", "</u>", string);
    }
}
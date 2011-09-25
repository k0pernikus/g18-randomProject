package randomproject;

/**
 * @author Philipp Kretzschmar
 */
abstract class TextDecorator implements ITextDecorators, IStringFunctions {
    abstract public String getTextDescription();

    public String wrap(String tag, String string) {
        return wrap(tag, tag, string);
    }

    public String wrap(String FirstTag, String EndTag, String string) {
        return FirstTag + string + EndTag;
    }
}

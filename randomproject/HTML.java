/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package randomproject;

/**
 * @author Philipp Kretzschmar
 */
public class HTML extends TextDecorator implements ITextDecorators {
    public String bold(String string) {
        return wrap("<b>","</b>", string);
    }

    public String italics(String string) {
        return wrap("<i>","</i>", string);
    }

    public String underline(String string) {
        return wrap("<u>", "</u>", string);
    }
}

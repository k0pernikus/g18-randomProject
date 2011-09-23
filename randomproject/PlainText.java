/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package randomproject;

/**
 * @author Philipp Kretzschmar
 */
public class PlainText extends TextDecorator {

    @Override
    public String getTextDescription() {
        return "Plain text";
    }


    public String bold(String string) {
        return wrap("*", string);
    }

    public String italics(String string) {
        return wrap("/",string);
    }

    public String underline(String string) {
        return wrap("_", string);
    }
}
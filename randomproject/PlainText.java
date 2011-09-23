/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package randomproject;

/**
 *
 * @author Philipp Kretzschmar
 */
public class PlainText extends Text {
    public String bold(String string) {
        return "*" + string + "*";
    }

    public String italics(String string) {
        return "/" + string + "/";
    }

    public String underline(String string) {
        return "_" + string + "_";
    }
}

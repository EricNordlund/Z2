/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.model.listitems;

/**
 * En klass som håller en nyckel och sträng för att användas i ListModel. Man
 * kan sedan hämta nyckeln från vald rad i den JList som tagit ListModel. Den
 * här klasen finns för att vi inte ska skicka customers ut i GUIn.
 */
public class ListItem {

    private int ID;
    private String displayName;

    public ListItem(int ID, String displayName) {

        this.ID = ID;
        this.displayName = displayName;

    }

    public int getID() {

        return ID;

    }

    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String toString() {

        return getDisplayName();

    }
}

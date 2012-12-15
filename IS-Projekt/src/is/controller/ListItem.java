/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.controller;

/**
 * En klass som håller en nyckel och sträng för att användas i ListModel. Man
 * kan sedan hämta nyckeln från vald rad i den JList som tagit ListModel. Den
 * här klasen finns för att vi inte ska skicka customers ut i GUIn.
 */
public class ListItem {
    
    private Integer key;
    private String displayName;

    public ListItem(Integer key, String displayName) {
        
        this.key = key;
        this.displayName = displayName;
        
    }
    
    public Integer getKey(){
        
        return key;
        
    }
    
    @Override
    public String toString(){
        
        return displayName;
        
    }
    
}

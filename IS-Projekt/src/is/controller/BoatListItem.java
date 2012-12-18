/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.controller;

/**
 *
 * @author svalan
 */
public class BoatListItem extends ListItem {

    private double price;

    public BoatListItem(int key, String displayName, double price) {

        super(key, displayName);

        this.price = price;

    }

    private double getPrice() {

        return price;

    }

    public String toString() {

        return getDisplayName() + " " + price;

    }
}

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

    public BoatListItem(int boatID, String displayName, double price) {

        super(boatID, displayName);

        this.price = price;

    }

    public double getPrice() {

        return price;

    }

    @Override
    public String toString() {

        return getDisplayName() + " " + price;

    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.controller;

import java.text.DecimalFormat;

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


        String quantity = "1 st ";

        String name = this.getDisplayName();

        String priceString = this.getPriceString();

        String padding = "";

        while (name.length() + padding.length() < 30) {

            padding = padding.concat(" ");
        }

        name = name.concat(padding);

        padding = "";

        while (priceString.length() + padding.length() < 12) {

            padding = padding.concat(" ");
        }

        priceString = padding.concat(priceString);


        return quantity + name + priceString;


    }

    private String getPriceString() {

        DecimalFormat df = new DecimalFormat("#.00");

        String priceString = df.format(getPrice());

        return priceString;

    }
}

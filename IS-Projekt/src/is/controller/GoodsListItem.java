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
public class GoodsListItem extends ListItem {

    private int quantity;
    private double price;

    public GoodsListItem(int ID, String displayName, double price, int quantity) {

        super(ID, displayName);
        this.price = price;
        this.quantity = quantity;

    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getTotalPrice() {

        return getQuantity() * getPrice();

    }

    @Override
    public String toString() {

        String quantity = getQuantity() + " st ";

        String name = this.getDisplayName();

        String price = this.getPriceString();

        String padding = "";

        while (name.length() + padding.length() < 30) {

            padding = padding.concat(" ");
        }

        name = name.concat(padding);

        padding = "";

        while (price.length() + padding.length() < 12) {

            padding = padding.concat(" ");
        }

        price = padding.concat(price);


        return quantity + name + price;

    }

    public void addQuantity(int i) {

        quantity += i;

    }

    private String getPriceString() {

        DecimalFormat df = new DecimalFormat("#.00");

        String priceString = df.format(getPrice());

        return priceString;

    }
}

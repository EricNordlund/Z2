/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.projekt;

/**
 * En klass som representerar likformiga varor som tillbehör och reservdelar.
 */
public class Goods extends Product {

    private String name;

    public Goods(int goodsID, String name, double price, String description) {

        super(goodsID, price, description);
        this.name = name;

    }

    @Override
    public String toString() {
        return name + " " + getPrice();
    }

    public String[] getDataArray() {

        String[] a = new String[3];

        a[0] = name;
        a[1] = Double.toString(getPrice());
        a[2] = getDescription();

        return a;

    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.projekt;

import is.controller.ListItem;

/**
 * En klass som representerar likformiga varor som tillbehör och reservdelar.
 */
public class Goods extends Product {

    private String name;

    protected Goods(int goodsID, String name, double price, String description) {

        super(goodsID, price, description);
        this.name = name;

    }
    
    private String getName(){
        
        return this.name;
        
    }

    public String[] getDataArray() {

        String[] a = new String[3];

        a[0] = this.getName();
        a[1] = this.getPriceString();
        a[2] = getDescription();

        return a;

    }

    @Override
    protected String getDisplayName() {

        return this.name;
    }

    protected ListItem getSimpleListItem() {
        
            String nameString = this.getDisplayName();

            nameString = StringFormatter.rightPad(nameString, 35);
            
            String priceString = StringFormatter.formatPriceString(this.getPrice());

            priceString = StringFormatter.leftPad(priceString, 10);

            String displayString = nameString + " " + priceString;

            ListItem listItem = new ListItem(this.getProductID(), displayString);
            
            return listItem;
        
    }
}

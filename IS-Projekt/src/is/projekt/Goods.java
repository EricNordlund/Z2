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
        a[1] = Double.toString(getPrice());
        a[2] = getDescription();

        return a;

    }

    @Override
    protected String getDisplayName() {

        return this.name;
    }
}

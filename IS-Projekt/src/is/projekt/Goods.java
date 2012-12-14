/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.projekt;

/**
 * En klass som representerar likformiga varor som tillbehör och reservdelar.
 */
public class Goods extends Product{
    
    private String productNr;

    public String getProductNr() {
        return productNr;
    }

    public void setProductNr(String productNr) {
        this.productNr = productNr;
    }
    
}

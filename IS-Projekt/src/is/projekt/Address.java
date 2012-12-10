/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.projekt;

/**
 *
 * @author svalan
 */
public class Address {

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    private String streetName;
    private String postCode;
    private String city;
    
}

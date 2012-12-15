/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.projekt;

/**
 * Klassen saknar setmetoder. Vill man ändra en address skapar man en ny och skriver över den gamla.
 * 
 * @param street Gatuadress inklusive jus/lägenehetsnummer.
 * @param postCode Postnummer.
 * @param city Stad.
 * 
 * @author Viktor Voigt
 * @author Eric Nordlund
 * @author Anna Thernfrid
 */
public class Address {
    
    private String street;
    private String postCode;
    private String city;
    

    public Address(String street, String postCode, String city) {
        this.street = street;
        this.postCode = postCode;
        this.city = city;
    }

    public String getStreetName() {
        return street;
    }
    
    public String getPostCode() {
        return postCode;
    }

    public String getCity() {
        return city;
    }

    
 
}

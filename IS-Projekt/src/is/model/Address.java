package is.model;

/**
 * Klassen saknar setmetoder. Vill man ändra en address skapar man en ny och
 * skriver över den gamla.
 *
 * @param street Gatuadress inklusive lägenehetsnummer.
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

    // Konstruktor
    public Address(String street, String postCode, String city) {
        this.street = street;
        this.postCode = postCode;
        this.city = city;
    }

    public String getStreetName() {
        return this.street;
    }

    public String getPostCode() {
        return this.postCode;
    }

    public String getCity() {
        return this.city;
    }
}

package is.model;

/**
 * Klassen saknar setmetoder. Vill man ändra en address skapar man en ny och
 * skriver över den gamla.
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

    protected String getStreetName() {
        return this.street;
    }

    protected String getPostCode() {
        return this.postCode;
    }

    protected String getCity() {
        return this.city;
    }
}

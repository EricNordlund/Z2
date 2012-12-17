/*
 * Innehåller de senaste idNummren till databasobjekt.
 * 
 */
package is.projekt;

public class RegistryNumbers {

    private int boatRegistryNumber;
    private int customerRegistryNumber;
    private int orderRegistryNumber;

    //Constructor
    public RegistryNumbers(int boatRegistryNumber, int customerRegistryNumber, int orderRegistryNumber) {
        this.boatRegistryNumber = boatRegistryNumber;
        this.customerRegistryNumber = customerRegistryNumber;
        this.orderRegistryNumber = orderRegistryNumber;
    }

    //Setters
    public void setBoatRegistryNumber(int boatRegistryNumber) {
        this.boatRegistryNumber = boatRegistryNumber;
    }

    public void setCustomerRegistryNumber(int customerRegistryNumber) {
        this.customerRegistryNumber = customerRegistryNumber;
    }

    public void setOrderRegistryNumber(int orderRegistryNumber) {
        this.orderRegistryNumber = orderRegistryNumber;
    }

    //Getters
    public int getBoatRegistryNumber() {
        return boatRegistryNumber;
    }

    public int getCustomerRegistryNumber() {
        return customerRegistryNumber;
    }

    public int getOrderRegistryNumber() {
        return orderRegistryNumber;
    }
}

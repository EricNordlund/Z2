/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.projekt;

/**
 *
 * @author svalan
 */
public class Customer {
    
    private Address address;
    private int customerNumber;
    private String phoneNumber;
    private String eMail;
    
    public Customer (int customerNumber){
        
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    
   public int getCustomerNumber() {
        return customerNumber;
    }
   
   public String getCustomerNumberString() {
        return Integer.toString(customerNumber);
    }
    
}

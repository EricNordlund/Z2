
package is.projekt;


public class Customer {
    
    private String name;
    private Address address;
    private int customerNumber;
    private String phoneNumber;
    private String eMail;
    
    public Customer (int customerNumber){
        
        this.customerNumber = customerNumber;
        
    }
    
        public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

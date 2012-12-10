
package is.projekt;


public class Order {
    private int idNumber;
    private int billingDate; 
    private String billingAdress;
    
    //Constructor...
    public Order(int iniIdNumber, int iniBillingDate, String iniBillingAdress)
    {
        idNumber = iniIdNumber;
        billingDate = iniBillingDate;
        billingAdress = iniBillingAdress;
    }
    

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setBillingDate(int billingDate) {
        this.billingDate = billingDate;
    }

    public void setBillingAdress(String billingAdress) {
        this.billingAdress = billingAdress;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public int getBillingDate() {
        return billingDate;
    }

    public String getBillingAdress() {
        return billingAdress;
    }
    
    
    
    
    
}

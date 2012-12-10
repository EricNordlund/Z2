
package is.projekt;

import java.util.ArrayList;
import java.util.List;


public class Order {
    private int idNumber;
    private int billingDate; 
    private String billingAdress;
    private List orderrader = new ArrayList();
    
    //Constructor...
    public Order(int idNumber, int billingDate, String billingAdress)
    {
        this.idNumber = idNumber;
        this.billingDate = billingDate;
        this.billingAdress = billingAdress;
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
    
    
    public void createOrderrad(float price, int number)
    {
       OrderRow newOrderrad = new OrderRow(price, number);
        orderrader.add(newOrderrad);
    }
    
}

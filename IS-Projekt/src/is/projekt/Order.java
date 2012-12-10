
package is.projekt;

import java.util.ArrayList;
import java.util.List;


public class Order {
    private int idNumber;
    private int billingDate; 
    private String billingAdress;
    private List orderRows = new ArrayList();
    
    //Constructor...
    public Order(int idNumber, int billingDate, String billingAdress)
    {
        this.idNumber = idNumber;
        this.billingDate = billingDate;
        this.billingAdress = billingAdress;
    }
    
    //Alla set.
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public void setBillingDate(int billingDate) {
        this.billingDate = billingDate;
    }

    public void setBillingAdress(String billingAdress) {
        this.billingAdress = billingAdress;
    }

    //Alla get. 
    public int getIdNumber() {
        return idNumber;
    }

    public int getBillingDate() {
        return billingDate;
    }

    public String getBillingAdress() {
        return billingAdress;
    }
    
    //Skapar de olika orderraderna, körs en gång för varje ny rad. 
    public void createOrderrad(float price, int number)
    {
       OrderRow newOrderRow = new OrderRow(price, number);
        orderRows.add(newOrderRow);
    }
    
    //Retunerar listan med orderraderna
    public List getOrderrows()
    {
        return orderRows;
    }
    
}

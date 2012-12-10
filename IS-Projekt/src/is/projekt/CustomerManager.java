/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.projekt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author svalan
 */
public class CustomerManager {
    
    private List<Customer> customerList;
    
    public CustomerManager(){
        
        customerList = new ArrayList();
    
}
    
    private void addCustomer(Customer customerIn){
        
        customerList.add(customerIn);
        
    }
    
    private void getCustomer(int customerNr){
        
        
        Iterator<Customer> iter = customerList.iterator();
        
        while (iter.hasNext()){
            
            
            
        }
        
        
        
    }
    
}

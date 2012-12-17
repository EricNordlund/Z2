/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.controller;

/**
 *
 * @author svalan
 */
public class OrderRowListItem extends ListItem{
    
    private int quantity;
    private double price;
    
  public OrderRowListItem(Integer key, String displayName, int quantity, double price){
      
      super(key, displayName);
      this.price = price;
      this.quantity = quantity;
      
  }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
    
    public double getTotalPrice(){
        
        return getQuantity() * getPrice();
        
    }
  
  @Override
  public String toString(){
      
      return getQuantity() + getDisplayName() + getTotalPrice();
      
  }
}  
    


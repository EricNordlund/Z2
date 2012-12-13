/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.projekt;

/**
 *
 * @author svalan
 */
public class Model {
    
    private OrderRegistry orderRegistry = new OrderRegistry();
    private CustomerRegistry customerRegistry = new CustomerRegistry();
    private BoatRegistry boatRegistry = new BoatRegistry();

    public OrderRegistry getOrderRegistry() {
        return orderRegistry;
    }

    public void setOrderRegistry(OrderRegistry orderRegistry) {
        this.orderRegistry = orderRegistry;
    }

    public CustomerRegistry getCustomerRegistry() {
        return customerRegistry;
    }

    public void setCustomerRegistry(CustomerRegistry customerRegistry) {
        this.customerRegistry = customerRegistry;
    }

    public BoatRegistry getBoatRegistry() {
        return boatRegistry;
    }

    public void setBoatRegistry(BoatRegistry boatRegistry) {
        this.boatRegistry = boatRegistry;
    }
    
    
}

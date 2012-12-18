/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.controller;

import is.projekt.Customer;
import is.projekt.Order;
import is.projekt.Registry;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author svalan
 */
public class ControllerTest {

    static void runTest(Controller controller, Registry model) {

        addCustomers(controller);

        addGoods(controller);
        
        addBoat(controller);
        
        Date datum = new Date(123);
        
        List or = new ArrayList();
        or.add("123");
        
        
        HashMap<Integer, Order> CR = model.getOrderRegistry();
        
        Order ord = CR.get(1);
        
   
        
        
    

    }

    private static void addCustomers(Controller controller) {
        controller.addCustomer("August Burgh", "Lommavängen 12", "22273", "Simrishamn", "0704558712", "ogge74@hotmail.com");
        controller.addCustomer("Laura Wittman", "Kringlegatan 1", "24552", "Vetlanda", "0739231577", "babsi123@gmail.com");
    }
    private static void addBoat(Controller controller){
        controller.addBoat("ABC123", "Z9000", "Lomma", 1, "Segelbåt", 50000);
    }

    private static void addGoods(Controller controller) {
        controller.addGoods("Plastbestick", 15.50, "Ett trevligt bestickset till båten.");
        controller.addGoods("Utombordsmotor LM-500", 3700.00, "En kraftig liten motor.");
        controller.addGoods("Becker Båtlack 5 liter", 370.00, "Prima lack till din båt.");
    }
   
       
    
    
}

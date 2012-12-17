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
        
        Date datum = new Date(123);
        
        List or = new ArrayList();
        or.add("123");
        
        addBuyOrders(controller, datum, or);
        
        HashMap<Integer, Order> CR = model.getOrderRegistry();
        
        Order ord = CR.get(1);
        
        System.out.println(ord.toInt());
        
        
    

    }

    private static void addCustomers(Controller controller) {
        controller.addCustomer("August Burgh", "Lommavängen 12", "22273", "Simrishamn", "0704558712", "ogge74@hotmail.com");
        controller.addCustomer("Laura Wittman", "Kringlegatan 1", "24552", "Vetlanda", "0739231577", "babsi123@gmail.com");
    }

    private static void addGoods(Controller controller) {
        controller.addGoods("Plastbestick", 15.50, "Ett trevligt bestickset till båten.");
        controller.addGoods("Utombordsmotor LM-500", 3700.00, "En kraftig liten motor.");
        controller.addGoods("Becker Båtlack 5 liter", 370.00, "Prima lack till din båt.");
    }
    private static void addBuyOrders(Controller controller, Date datum, List orl) {
    controller.addBuyOrder(datum, "Tomegapsbacken 10", "22351", "Lund", orl, 2, true);
    controller.addBuyOrder(datum, "Tomtegatan 12", "18130", "Lomma", orl, 2, true);
    }
    
       
    
    
}

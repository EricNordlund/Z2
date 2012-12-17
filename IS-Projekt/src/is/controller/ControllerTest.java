/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.controller;

/**
 *
 * @author svalan
 */
public class ControllerTest {

    static void runTest(Controller controller) {

        addCustomers(controller);

        addGoods(controller);
        
        removeCustomer(controller);

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
    private static void removeCustomer(Controller controller){
        controller.removeCustomer(1);
       } 
    }


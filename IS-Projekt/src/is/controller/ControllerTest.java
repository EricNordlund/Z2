/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.controller;

/**
 * Denna klass ska bara användas för att testa controllern. INGA importer ska
 * vara nödvändiga.
 *
 * @author svalan
 */
public class ControllerTest {

    static void runTest(Controller controller) {

        addBoats(controller);
        
        addCustomers(controller);

        addGoods(controller);

    }
    
    private static void addBoats(Controller controller){
        
        controller.addBoat("31233131", "Cascade 29", "Lomma", "En stabil segelbåt.", 500000.00);
        controller.addBoat("55542342", "Cascade 42", "Lomma", "En stabil segelbåt.", 150000.00);
        controller.addBoat("87686677", "Cascade 36", "Lomma", "En stabil segelbåt.", 510000.00);
        controller.addBoat("46456456", "Cascade 24", "Lomma", "En stabil segelbåt.", 503000.00);
        controller.addBoat("42342343", "Cascade 27", "Lomma", "En stabil segelbåt.", 12000.00);
        controller.addBoat("08908909", "Beneteau First 21.7 S", "Lomma", "En stabil segelbåt.", 1220000.00);
        controller.addBoat("08990800", "Beneteau First 25.7 S", "Lomma", "En stabil segelbåt.", 550000.00);
        controller.addBoat("23434242", "Beneteau First 27.7 S", "Lomma", "En stabil segelbåt.", 3000.00);
        controller.addBoat("23423423", "Beneteau First 31.7", "Lomma", "En stabil segelbåt.", 12000.00);
        controller.addBoat("45345345", "Beneteau First 35", "Lomma", "En stabil segelbåt.", 1250000.00);
        controller.addBoat("57567567", "Beneteau First 35", "Lomma", "En stabil segelbåt.", 550000.00);
        controller.addBoat("42343243", "Beneteau First 35", "Lomma", "En stabil segelbåt.", 510000.00);
        controller.addBoat("08908089", "Columbia 7.6 - PHRF 210", "Lomma", "En stabil segelbåt.", 800000.00);
        controller.addBoat("21311232", "Columbia 8.3 - PHRF 198", "Lomma", "En stabil segelbåt.", 6990000.00);
        controller.addBoat("64656456", "Columbia Sabre - PHRF 198", "Lomma", "En stabil segelbåt.", 150000.00);
    }

    private static void addCustomers(Controller controller) {
        controller.addNewCustomer("August Burgh", "Lommavängen 12", "22273", "Simrishamn", "0704558712", "ogge74@hotmail.com");
        controller.addNewCustomer("Laura Wittman", "Kringlegatan 1", "24552", "Vetlanda", "0739231577", "babsi123@gmail.com");
        controller.addNewCustomer("Ewi Goodman", "Fågelgatan 1", "24552", "Vetlanda", "0739231577", "ewiiiiii@yahoo.com");
        controller.addNewCustomer("Arne Kart", "Bokvägen 3", "24552", "Hörby", "0739231577", "arne@gmail.com");
        controller.addNewCustomer("Mia Larsson", "Kringlegatan 21", "24442", "Gnesta", "0737771577", "mia.larsson@telia.se");
        controller.addNewCustomer("Stina Kristersson", "Rosenvägen 11", "24552", "Stockholm", "0739266577", "fina_stina@yahoo.com");
        controller.addNewCustomer("Per Wiman", "Stortorget 31", "23352", "Hörby", "0739231577", "per.kristersson@msn.se");
        controller.addNewCustomer("Roald Andersson", "Stockholmsvägen 12", "24533", "Vetlanda", "0736631577", "r.andersson@skatteverket.se");
        controller.addNewCustomer("Sven Höög", "Kringlegatan 1", "21552", "Hässleholm", "0739231566", "sven.hoog@hassleholm.se");
        controller.addNewCustomer("Lisa Persson", "Kung Oscars Väg 127b", "24152", "Ödåkra", "0739266577", "babsi123@gmail.com");
        
    }

    private static void addGoods(Controller controller) {

        controller.addGoods("Plastbestick", 15.50, "Ett trevligt bestickset till båten.");
        controller.addGoods("Utombordsmotor LM-500", 3700.00, "En kraftig liten motor.");
        controller.addGoods("Becker Båtlack 5 liter", 370.00, "Prima lack till din båt.");
        controller.addGoods("Brytpinnar", 55.00, "Brytpinnar i sjönöd. Gröna.");
        controller.addGoods("Bränsleadditiv", 500.00, "Prima lack till din båt.");
        controller.addGoods("Utombordare Honda BF 115 D", 3700.00, "Prima lack till din båt.");
        controller.addGoods("Utombordare Honda BF 116", 2330.00, "Prima lack till din båt.");
        controller.addGoods("Utombordare Honda BF 122 F", 1299.99, "Prima lack till din båt.");
        controller.addGoods("Utombordare Honda 55", 1999.90, "Prima lack till din båt.");

    }
}

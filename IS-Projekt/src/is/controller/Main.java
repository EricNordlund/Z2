
package is.controller;

import is.gui.MainWindow;
import is.projekt.CustomerRegistry;
import is.projekt.BoatRegistry;


public class Main {
    
    public static void main(String[] args){
        
        Controller controller = new Controller(new CustomerRegistry(), new BoatRegistry(), new MainWindow());
        controller.startMainWindow();
        
    }
    
}

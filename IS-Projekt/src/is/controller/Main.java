
package is.controller;

import is.gui.MainWindow;
import is.projekt.CustomerRegistry;


public class Main {
    
    public static void main(String[] args){
        
        Controller controller = new Controller(new CustomerRegistry(), new MainWindow());
        controller.startMainWindow();
        
    }
    
}

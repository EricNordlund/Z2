/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.controller;

import is.gui.MainWindow;
import is.projekt.CustomerRegistry;

/**
 *
 * @author svalan
 */
public class Main {
    
    public static void main(String[] args){
        
        Controller controller = new Controller(new CustomerRegistry(), new MainWindow());
        
    }
    
}

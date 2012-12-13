
package is.controller;

import is.gui.MainWindow;
import is.projekt.Model;


public class Main {
    
    public static void main(String[] args){
        
        Model model = new Model();
        MainWindow view = new MainWindow(model);
        Controller controller = new Controller (model, view);
        controller.getMainWindow().setVisible(true);
    }
    
}

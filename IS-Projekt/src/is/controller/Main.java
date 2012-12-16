package is.controller;

import is.gui.MainWindow;
import is.projekt.Model;

public class Main {

    public static void main(String[] args) {

        Model model = new Model();
        
        Controller controller = new Controller(model);
        
        ControllerTest.runTest(controller);
        
        MainWindow view = new MainWindow();
        
        view.setController(controller);
        view.updateLists();
        view.setVisible(true);
        
        
        

    }
}

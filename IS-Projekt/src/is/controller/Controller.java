
package is.controller;

import is.gui.MainWindow;
import is.projekt.Model;

/**
 * Detta är en klass som kör gui samt applikation och samordnar dessa.
 */
public class Controller {

    MainWindow mainWindow;
    Model model;

    public Controller(Model model, MainWindow view) {
        
        this.model = model;
        this.mainWindow = view;
        
    }

    public Model getModel() {
        return model;
    }

    public MainWindow getMainWindow() {
        return mainWindow;
    }

    public void setMainWindow(MainWindow mainWindow) {
        this.mainWindow = mainWindow;
    }
    
    


   
    
}

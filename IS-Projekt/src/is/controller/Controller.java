
package is.controller;

import is.gui.MainWindow;
import is.projekt.Model;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * This class handles input from the user interface to the model.
 * @param mainWindow The user interface.
 * @param model The model.
 */
public class Controller implements ActionListener {

    private MainWindow mainWindow;
    private Model model;

    public Controller (Model model, MainWindow view) {
        
        this.model = model;
        this.mainWindow = view;
        mainWindow.setListener(this);
        
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

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
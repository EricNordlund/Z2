package is.controller;

import is.gui.MainWindow;
import is.projekt.Model;
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;

/**
 * This class handles input from the user interface to the model.
 *
 * @param mainWindow The user interface.
 * @param model The model.
 */
public class Controller {

    private MainWindow view;
    private Model model;

    public Controller(Model model, MainWindow view) {

        this.model = model;
        this.view = view;

    }

    private Model getModel() {
        return model;
    }

    private MainWindow getView() {
        return view;
    }
  


    }

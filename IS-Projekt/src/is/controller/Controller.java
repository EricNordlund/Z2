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
public class Controller implements ActionListener {

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

    @Override
    public void actionPerformed(ActionEvent e) {
        
        System.out.println("");
        System.out.println("Incoming event from: " + e.getSource().getClass().getSimpleName());
        System.out.println("Action command:      " + e.getActionCommand());
        System.out.println("Parameter string:    " + e.paramString());
        
        }

    }

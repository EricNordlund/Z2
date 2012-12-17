package is.controller;

import is.gui.MainWindow;
import is.projekt.Registry;

public class Main {

    public static void main(String[] args) {

        Registry model = new Registry();

        Controller controller = new Controller(model);

        ControllerTest.runTest(controller, model);

        MainWindow view = new MainWindow();

        view.setController(controller);
        view.updateLists();
        view.setVisible(true);




    }
}

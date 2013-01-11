/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.projekt;

import is.controller.ListItem;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/**
 *
 * @author anna_thernfrid, Viktor Voigt
 */
public class BoatRegistry implements Serializable {

    private HashMap<Integer, Boat> boatList = new HashMap<>();
    private int boatKeyCount = 0;
    private ReferenceHandler referenceHandler;

    protected Boat getBoat(int boatID) {

        return getBoatList().get(boatID);

    }

    private HashMap<Integer, Boat> getBoatList() {
        return boatList;
    }

    private int getNewBoatKey() {
        boatKeyCount++;
        return boatKeyCount;
    }

    public void addBoat(String regnr, String model, String location, String description, double price) {

        int boatID = getNewBoatKey();

        this.editBoat(boatID, regnr, model, location, description, price);

    }

    public void editBoat(int boatID, String regnr, String model, String location, String description, double price) {

        Boat b = new Boat(boatID, regnr, model, location, description, price);

        getBoatList().put(boatID, b);
    }

    public void removeBoat(int boatID) {
        this.getBoatList().remove(boatID);
    }

    public String[] getBoatData(int boatID) {

        String[] boatData = this.getBoatList().get(boatID).getDataArray();

        return boatData;

    }

    /**
     * 
     * @return 
     */
    public ListModel getListModel() {

        HashMap<Integer, Boat> hm = this.getBoatList();

        DefaultListModel lm = new DefaultListModel();

        Iterator it = hm.entrySet().iterator();

        while (it.hasNext()) {

            Map.Entry e = (Map.Entry) it.next();

            int key = (Integer) e.getKey();

            Boat b = (Boat) e.getValue();
 
            String nameString = b.getDisplayName();
            
            nameString = StringFormatter.rightPad(nameString, 35);

            String priceString = b.getPriceString();
            
            priceString = StringFormatter.leftPad(priceString, 12);

            String displayString = nameString + " " + priceString;

            ListItem item = new ListItem(key, displayString);

            lm.addElement(item);

        }

        return lm;
    }

    protected void setReferenceHandler(ReferenceHandler aThis) {
        referenceHandler = aThis;
    }
}

package is.model;

import is.model.listitems.BoatListItem;
import is.model.listitems.ListItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/**
 *
 * @author anna_thernfrid, Viktor Voigt
 */
public class BoatRegistry {

    private HashMap<Integer, Boat> boatList = new HashMap<>(100);
    private int boatKeyCount = 0;
    private ReferenceHandler referenceHandler;

    
    protected void setReferenceHandler(ReferenceHandler aThis) {
        referenceHandler = aThis;
    }
    
    protected Boat getBoat(int boatID) {

        return getBoatList().get(boatID);

    }

    private HashMap<Integer, Boat> getBoatList() {
        return this.boatList;
    }

    private Iterator<Entry<Integer, Boat>> getBoatListIterator() {

        return this.boatList.entrySet().iterator();

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

    public ListModel<ListItem> getListModel() {

        DefaultListModel<ListItem> lm = new DefaultListModel<>();

        Iterator<Entry<Integer, Boat>> it = this.getBoatListIterator();

        while (it.hasNext()) {

            Map.Entry<Integer, Boat> e = it.next();

            Boat b = e.getValue();

            ListItem listItem = b.getSimpleListItem();

            lm.addElement(listItem);

        }

        return lm;
    }

    public BoatListItem getBoatListItem(int boatID) {

        Boat b = this.getBoat(boatID);

        BoatListItem bli = b.getBoatListItem();

        return bli;

    }
}

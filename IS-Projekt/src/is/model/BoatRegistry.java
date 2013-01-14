package is.model;

import is.model.listitems.BoatListItem;
import is.model.listitems.ListItem;
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
    private ListItem createListItem;

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
    public ListModel<ListItem> getListModel() {

        HashMap<Integer, Boat> hm = this.getBoatList();

        DefaultListModel<ListItem> lm = new DefaultListModel<>();

        Iterator it = hm.entrySet().iterator();

        while (it.hasNext()) {

            Map.Entry e = (Map.Entry) it.next();

            Boat b = (Boat) e.getValue();
            
            ListItem listItem = b.getSimpleListItem();

            lm.addElement(listItem);

        }

        return lm;
    }

    protected void setReferenceHandler(ReferenceHandler aThis) {
        referenceHandler = aThis;
    }

    public BoatListItem getBoatListItem(int boatID) {
        
        Boat b = this.getBoat(boatID);
        
        BoatListItem bli = b.getBoatListItem();
        
        return bli;
        
    }

}

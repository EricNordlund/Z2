/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.projekt;

import is.controller.ListItem;
import java.io.Serializable;
import java.util.ArrayList;
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
    
    protected Boat getBoat(int boatID){
        
        return getBoatList().get(boatID);
        
    }

    private HashMap<Integer, Boat> getBoatList() {
        return boatList;
    }

    private int getNewBoatKey() {
        boatKeyCount++;
        return boatKeyCount;
    }

    public void addBoat(Boat b) {
        getBoatList().put(getNewBoatKey(), b);
    }

    public void editBoat(Integer boatID, Boat b) {
        getBoatList().put(boatID, b);
    }

    public void removeBoat(Integer boatID) {
        this.getBoatList().remove(boatID);
    }
    
    public ArrayList<String>getBoatData(int boatID){
        
        
        
        ArrayList <String> boatData = this.getBoatList().get(boatID).getDataAsList();
        
        return boatData;
        
        
    }

    protected void setReferenceHandler(ReferenceHandler aThis) {
        referenceHandler = aThis;
    }

    public ListModel getListModel() {
        
        
                HashMap<Integer, Boat> hm = this.getBoatList();
        
        DefaultListModel lm = new DefaultListModel();

        Iterator it = hm.entrySet().iterator();

        while (it.hasNext()) {

            Map.Entry e = (Map.Entry) it.next();

            Integer key = (Integer) e.getKey();

            String displayString = e.getValue().toString();

            ListItem item = new ListItem(key, displayString);

            lm.addElement(item);

        }

        return lm;
    }
}

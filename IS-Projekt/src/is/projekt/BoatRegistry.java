/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.projekt;

import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author anna_thernfrid
 */
public class BoatRegistry implements Serializable{
    
     private HashMap<Integer, Boat> boatRegistry = new HashMap<>();
     private int boatKeyCount = 0;
     
     public HashMap<Integer, Boat> getBoatRegistry() {
        return boatRegistry;
    }
      private int getNewBoatKey() {
        boatKeyCount++;
        return boatKeyCount;
    }
      public void addBoat(Boat b) {
        getBoatRegistry().put(getNewBoatKey(), b);
    }

    public void editBoat(Integer boatID, Boat b) {
        getBoatRegistry().put(boatID, b);
    }

    public void removeBoat(Integer boatID) {
        this.getBoatRegistry().remove(boatID);
    }
    
}

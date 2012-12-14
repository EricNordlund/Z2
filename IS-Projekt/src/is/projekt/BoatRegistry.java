
package is.projekt;

import java.util.HashMap;
import java.util.Iterator;


public class BoatRegistry extends HashMap{
    
    public BoatRegistry() {


    }

    //Skapar båtobjekt.
    public Boat getNewBoat() {

        Boat newBoat = new Boat(createBoatNumber());

        addBoat(newBoat);

        return newBoat;

    }

    //Skapar ett nytt båtnummer genom att räkna antalet objekt i arraylist och sedan lägga till en siffra. 
    private int createBoatNumber() {

        int newNumber = 1;

        Iterator<Boat> iter = this.iterator();

        while (iter.hasNext()) {

            Boat c = iter.next();

            if (c.getBoatNumber() == newNumber) {

                newNumber = c.getBoatNumber() + 1;
            }

        }

        return newNumber;
    }
    
 
    //Tar bort en båt ur registret. 
    public void deleteBoat(int boatNumber) {
        
        boatList.remove(getBoat(boatNumber));

 
    }
}
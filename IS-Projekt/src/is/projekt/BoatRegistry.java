
package is.projekt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class BoatRegistry {

    private List<Boat> boatList;

    
    //Constructor
    public BoatRegistry() {

        boatList = new ArrayList();

    }

    //Lagrar kundobjektet i databasen.
    public void addBoat(Boat boatIn) {

        boatList.add(boatIn);

    }

    //Skapar båtobjekt.
    public Boat getNewBoat() {

        Boat newBoat = new Boat(createBoatNumber());

        addBoat(newBoat);

        return newBoat;

    }

    //Letar igenom båtregistret efter ett specefikt kundnr. Hittas inte nummret retuneras null.
    private Boat getBoat(int boatNr) {

        Iterator<Boat> iter = boatList.iterator();
        
        Boat b;
        
        while (iter.hasNext()) {
            
            b = iter.next();

            if (b.getBoatNumber() == boatNr) {

                return b;
            }

        }

        return null;

    }

    //Skapar ett nytt båtnummer genom att räkna antalet objekt i arraylist och sedan lägga till en siffra. 
    private int createBoatNumber() {

        int newNumber = 1;

        Iterator<Boat> iter = boatList.iterator();

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
package is.projekt;

import java.util.ArrayList;

public class Boat extends Product {

    //Variabler
    private String regnr;
    private String model;
    private String location;
    private int boatID;

    //Konstruktor
    public Boat(String regnr, String model, String location, String description, double price) {
        
        super(price, description);
        
        this.regnr = regnr;
        this.model = model;
        this.location = location;
        this.boatID = boatID;
      
    }

    public String getRegnr() {
        return regnr;
    }

    public void setRegnr(String regnr) {
        this.regnr = regnr;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    

    public int getBoatID() {
        return boatID;
    }

    public void setBoatID(int boatIdNumber) {
        this.boatID = boatIdNumber;
    }
    public ArrayList<String> getDataAsList() {

        ArrayList<String> l = new ArrayList<>();

        l.add(Integer.toString(getBoatID()));
        l.add(getRegnr());
        l.add(getModel());
        l.add(getLocation());
        l.add(getDescription());
        l.add(Double.toString(getPrice()));
   
       return l;
      
              
    }

    
    public String toString() {

        return getRegnr() + ", " + getModel();

    }   
    }

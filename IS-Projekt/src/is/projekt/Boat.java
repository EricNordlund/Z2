package is.projekt;

import java.util.ArrayList;

public class Boat extends Product {

    //Variabler
    private String regnr;
    private String model;
    private String location;

    //Konstruktor
    protected Boat(int boatID, String regnr, String model, String location, String description, double price) {

        super(boatID, price, description);

        this.regnr = regnr;
        this.model = model;
        this.location = location;

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
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

 

    public String[] getDataArray() {

        String[] array = new String[6];

        array[0] = this.getProductIDString();
        array[1] = this.getRegnr();
        array[2] = this.getModel();
        array[3] = this.getLocation();
        array[4] = this.getDescription();
        array[5] = this.getPriceString();

        return array;


    }
    
    /**
     * Kombinerar regnr och modellbeteckning för till en String.
     * @return 
     */
    @Override
    protected String getDisplayName() {
        return getRegnr() + ", " + getModel();
    }
}

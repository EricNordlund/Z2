package is.projekt;

import is.controller.ListItem;
import java.text.DecimalFormat;

/**
 * Klassen ansvarar för att lagra information om företagets båtar.
 *
 * @author Viktor Voigt
 * @author Anna Thernfrid
 * @author Eric Nordlund
 */
public class Boat extends Product {

    //Variabler
    private String regNr;
    private String model;
    private String location;

    //Konstruktor
    protected Boat(int boatID, String regnr, String model, String location, String description, double price) {

        super(boatID, price, description);

        this.regNr = regnr;
        this.model = model;
        this.location = location;

    }

    public String getRegnr() {
        return regNr;
    }

    public void setRegnr(String regnr) {
        this.regNr = regnr;
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

        String[] boatDataArray = new String[6];

        boatDataArray[0] = this.getProductIDString();
        boatDataArray[1] = this.getRegnr();
        boatDataArray[2] = this.getModel();
        boatDataArray[3] = this.getLocation();
        boatDataArray[4] = this.getDescription();
        boatDataArray[5] = this.getPriceString();

        return boatDataArray;


    }

    /**
     * Kombinerar regnr och modellbeteckning för till en String.
     *
     * @return
     */
    @Override
    protected String getDisplayName() {

        String displayName = getRegnr() + ", " + getModel();

        return displayName;
    }

    /**
     * Returnerar ett ListItem som bara har ett produktID samt en sträng 
     * som visas i listor
     * 
     */
    protected ListItem getSimpleListItem() {

        String nameString = this.getDisplayName();

        nameString = StringFormatter.rightPad(nameString, 35);

        String priceString = StringFormatter.formatPriceString(this.getPrice());

        priceString = StringFormatter.leftPad(priceString, 12);

        String displayString = nameString + " " + priceString;

        ListItem listItem = new ListItem(this.getProductID(), displayString);

        return listItem;

    }
}

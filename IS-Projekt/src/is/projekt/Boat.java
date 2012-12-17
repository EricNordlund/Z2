package is.projekt;

public class Boat extends Product {

    //Variabler
    private String regnr;
    private String model;
    private String location;
    private String priceInfo;
    private String description;
    private int boatIdNumber;

    //Konstruktor
    public Boat() {

        super(50.50, "Båt.");
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

    public String getPriceInfo() {
        return priceInfo;
    }

    public void setPriceInfo(String priceInfo) {
        this.priceInfo = priceInfo;
    }
    public String getDescription() {
        return description;
    }

    public void setdescription(String description) {
        this.description = description;
    }

    public int getBoatIdNumber() {
        return boatIdNumber;
    }

    public void setBoatIdNumber(int boatIdNumber) {
        this.boatIdNumber = boatIdNumber;
    }

  

    //Metod för att skapa en array som kan sparas i en databas
    public String[] createArray() {

        String[] dataArray = new String[5];

        dataArray[0] = regnr;
        dataArray[1] = model;
        dataArray[2] = location;
        dataArray[3] = priceInfo;
        dataArray[4] = description;
        return dataArray;
    }
}


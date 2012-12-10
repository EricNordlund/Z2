
package is.projekt;


public class Boat {
    
    //Variabler
    private String regnr;
    private String model;
    private String location;
    private String priceInfo;
    private String description;
    
    private String dbID;
    private String[] dataArray = new String[5];
    
    
    //Constructor
    public Boat(String iniregnr, String inimodel, String inilocation, String inipriceInfo, String inidescription)
    {
        regnr = iniregnr;
        model = inimodel;
        location = inilocation;
        priceInfo = inipriceInfo;
        description = inidescription;
    }
    
    //Metod för att ändra på båtens data.
    public void modifyData(String modregnr, String modmodel, String modlocation, String modpriceInfo, String moddescription)
    {
        //Kontrollerar om det har skett en förändrig i den text som är satt.
        if(modregnr.length() != 0)
        {
            regnr = modregnr;
        }
        
        if(modmodel.length() != 0)
        {
            model = modmodel;
        }
        
        if(modlocation.length() != 0)
        {
            location = modlocation;
        }
        
        if(modpriceInfo.length() != 0)
        {
            priceInfo = modpriceInfo;
        }
        
        if(moddescription.length() != 0)
        {
            description = moddescription;
        }
    }
    
    //Metoder för att hämta ut data.
    public String getRegnr()
    {
        return regnr;
    }
    
    public String getModel()
    {
        return model;
    }
    
    public String getLocation()
    {
        return location;
    }
    
    public String getpriceInfo()
    {
        return priceInfo;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    //Metod för att skapa en array som kan sparas i en databas
    public String[] createArray()
    {
        dataArray[0] = regnr; 
        dataArray[1] = model;
        dataArray[2] = location;
        dataArray[3] = priceInfo;
        dataArray[4] = description;
        return dataArray;
    }
    
}


package is.projekt;

public class InputCheck {
    
    
    
    public void InputCheck() 
    {
        
    }
    
    
    /*
     * Kontrollerar att en sträng är minst 3 bokstäver lång. 
     * @param s Strängen som kontrolleras.
     */
    public boolean chekString(String s) 
    {
        String input = s;

        if(input.length() > 3)
        {
            return true;
        }
        else 
        {
            return false;
        }
    
    }
    /*
     * Konverterar en string till siffror och 
     * kontrollerar att det håller sig inom ett 
     * sex-siffrigt datumspann.
     * @param s Sträng bestående av siffror.
     */
    public boolean checkDate(String s)
    {
        Integer date = Integer.valueOf(s);
        if(date > 99999 && date < 1000000)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}

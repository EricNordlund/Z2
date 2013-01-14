package is.projekt;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 *
 * @author Eric Nordlund
 * @author Viktor Voigt
 */
public class InputChecker {

    public void InputCheck() {
    }

    /*
     * Kontrollerar att en sträng är minst 3 bokstäver lång. 
     * @param s Strängen som kontrolleras.
     */
    public boolean checkString(String s) {
        String input = s;

        if (input.length() > 2) {
            return true;
        } else {
            return false;
        }

    }
    /*
     * Konverterar en string till siffror och 
     * kontrollerar att det håller sig inom ett 
     * sex-siffrigt datumspann.
     * @param s Sträng bestående av siffror.
     */

    public boolean checkDate(String s) {

        int date;

        if (this.checkStringToInteger(s)) {

            date = Integer.valueOf(s);

        } else {

            return false;

        }

        if (date < 100000 || date > 999999) {

            return false;
        }

        return true;

    }

    public boolean checkStringToInteger(String s) {

        try {
            int i = Integer.valueOf(s);

        } catch (NumberFormatException exception) {

            return false;

        }

        return true;
    }

    public boolean checkStringToDouble(String s) {

        NumberFormat format = NumberFormat.getInstance(Locale.getDefault());

        try {

            Number number = format.parse(s);

        } catch (ParseException ex) {

            return false;

        }

        return true;

    }

    public double parseStringToDouble(String s) {

        NumberFormat format = NumberFormat.getInstance(Locale.getDefault());

        Number number;
        
        double d = 0;
        
        try {
            
         number = format.parse(s);
         
         d = number.doubleValue();
        
        } catch (ParseException ex){
            
            System.out.println("Felaktig konvertering av String till double.");
            
        }
   
        return d;
        
    }
}

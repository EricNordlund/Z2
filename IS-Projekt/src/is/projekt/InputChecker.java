package is.projekt;

public class InputChecker {

    public void InputCheck() {
    }

    /*
     * Kontrollerar att en sträng är minst 3 bokstäver lång. 
     * @param s Strängen som kontrolleras.
     */
    public boolean chekString(String s) {
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

        } catch (NumberFormatException nfe) {

            return false;

        }

        return true;
    }
}

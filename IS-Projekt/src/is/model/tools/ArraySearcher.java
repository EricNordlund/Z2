/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.model.tools;

/**
 *
 * @author Viktor Voigt
 */
public class ArraySearcher {
    
     /**
     * Privat konstruktor förhindrar instanser av misstag.
     */
    private ArraySearcher() {
    }

    public static boolean searchStringArray(String[] array, String s) {

        String searchString = s.toLowerCase();

        for (int j = 0; j < array.length; j++) {

            String customerString = array[j].toLowerCase();

            if (customerString.contains(searchString)) {

                return true;
            }
        }

        return false;



    }


}

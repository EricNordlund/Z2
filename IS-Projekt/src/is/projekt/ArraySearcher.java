/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.projekt;

/**
 *
 * @author Viktor
 */
public class ArraySearcher {

    public static boolean searchStringArray(String[] array, String searchString) {

        searchString = searchString.toLowerCase();
        
        for (int j = 0; j < array.length; j++) {

            String customerString = array[j].toLowerCase();

            if (customerString.contains(searchString)) {

                return true;
            }
        }

        return false;



    }
}

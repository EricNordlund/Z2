/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package is.projekt;

/**
 * En klass som formaterar strängar så vi slipper ha dubblettkod för de
 * funktionerna överallt.
 *
 * @author Viktor Voigt
 */
public class StringFormatter {

    public static String leftPad(String stringIn, int paddedSize, String paddingCharacter) {

        String paddingString = CreatePadding(stringIn, paddedSize, paddingCharacter);

        String stringOut = paddingString + stringIn;
    
        return stringOut;

    }
    
   public static String leftPad(String stringIn, int paddedSize) {

        return leftPad(stringIn, paddedSize, " ");

    }
    
    public static String rightPad(String stringIn, int paddedSize, String paddingCharacter) {

        String paddingString = CreatePadding(stringIn, paddedSize, " ");

        String stringOut = stringIn + paddingString;
    
        return stringOut;

    }
    
   public static String rightPad(String stringIn, int paddedSize) {

        return rightPad(stringIn, paddedSize, " ");

    }
    
    private static String CreatePadding (String stringIn, int paddedSize, String paddingCharacter) {
       
       String paddingString = "";
       
       while (stringIn.length() + paddingString.length() < paddedSize){
           
           paddingString = paddingString + paddingCharacter;
           
       }

       return paddingString; 
    }
}
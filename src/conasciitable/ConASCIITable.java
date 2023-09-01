/*
 * Program: ASCII Table 
 * Programmer: J. Sookha 
 * Date: 22 April 2023 
 * Description: Displaying the 256  
 */
package conasciitable;

public class ConASCIITable {

    public static void main(String[] args) {
        int intDecimalNumber = 0; 
        char chrThisCharacter;
        
        /*
        // This list prints 128 characters in the ASCII chart from 0 to 127
        for (intDecimalNumber = 0; intDecimalNumber <= 127; intDecimalNumber++){
            chrThisCharacter = (char)intDecimalNumber; 
            // (char)number is a sort of conversion - in this case - casting 
            // the number to become the character it is
            System.out.println(intDecimalNumber + " = " + chrThisCharacter); 
        }
        */
        // printing the capital letters 
        System.out.println("CAPITAL LETTERS ONLY"); 
        for (intDecimalNumber = 65; intDecimalNumber <= 90; intDecimalNumber++){
            chrThisCharacter = (char)intDecimalNumber; 
            System.out.println(intDecimalNumber + " = " + chrThisCharacter); 
        }
        
        //printing numbers 
        System.out.println("NUMBERS ONLY");
        for (intDecimalNumber = 48; intDecimalNumber <= 57; intDecimalNumber++){
            chrThisCharacter = (char)intDecimalNumber; 
            System.out.println(intDecimalNumber + " = " + chrThisCharacter); 
        }
        
        // special characters - multiple ranges 
        System.out.println("VARIOUS SPECIAL CHARACTERS");
        for (intDecimalNumber = 32; intDecimalNumber <= 47; intDecimalNumber++){
            chrThisCharacter = (char)intDecimalNumber; 
            System.out.println(intDecimalNumber + " = " + chrThisCharacter); 
        }
        
        for (intDecimalNumber = 58; intDecimalNumber <= 64; intDecimalNumber++){
            chrThisCharacter = (char)intDecimalNumber; 
            System.out.println(intDecimalNumber + " = " + chrThisCharacter); 
        }
                
        for (intDecimalNumber = 91; intDecimalNumber <= 96; intDecimalNumber++){
            chrThisCharacter = (char)intDecimalNumber; 
            System.out.println(intDecimalNumber + " = " + chrThisCharacter); 
        }
                        
        for (intDecimalNumber = 123; intDecimalNumber <= 126; intDecimalNumber++){
            chrThisCharacter = (char)intDecimalNumber; 
            System.out.println(intDecimalNumber + " = " + chrThisCharacter); 
        }
        
        System.out.println("PRINTING CHARACTER NUMBERS FROM A STRING");
        String strName = "SAMPLETEXT"; 
        
        for (int intIndex = 0; intIndex < strName.length(); intIndex++) { 
            chrThisCharacter = strName.charAt(intIndex); // retrieve a single character
            intDecimalNumber = (int)chrThisCharacter; //convert character into ASCII number equivalent
            //printing each character in your name with the numberic value next to it
            System.out.println(strName.charAt(intIndex) + " = " + intDecimalNumber);
        }
    }
}

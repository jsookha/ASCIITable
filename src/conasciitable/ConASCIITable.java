/*
 * Program:      ASCII Table
 * Programmer:   J. Sookha
 * Date:         22 April 2023
 * Updated:      21 September 2026 (refactored with helper method + richer comments)
 *
 * Description:
 *   This program demonstrates the relationship between characters and
 *   their numeric (ASCII / Unicode) values in Java. Every character that
 *   a computer displays is stored internally as a number - for example,
 *   the capital letter 'A' is stored as the number 65, and the digit '0'
 *   is stored as 48.
 *
 *   The program works in BOTH directions:
 *     1. int  -> char : we take a decimal number and CAST it to a char
 *                       using (char)intDecimalNumber. This turns the
 *                       number into the character it represents.
 *     2. char -> int  : we take a character from a String and CAST it
 *                       to an int using (int)chrThisCharacter. This
 *                       reveals the numeric code behind the character.
 *
 *   To keep the output readable, the ASCII table is broken into logical
 *   groups (capitals, digits, and various special characters) instead of
 *   printing all 128 values in one long list. Each group is preceded by
 *   a sub-heading so the reader can see what is being shown.
 *
 *   A helper method (displayAsciiRange) is used to avoid repeating the
 *   same loop over and over for each range of numbers.
 */
package conasciitable;

public class ConASCIITable {

    public static void main(String[] args) {

        // 1. CAPITAL LETTERS  (ASCII 65 - 90  ->  'A' to 'Z')
        System.out.println("================================");
        System.out.println("CAPITAL LETTERS ONLY");
        System.out.println("================================");
        displayAsciiRange(65, 90);

        // 2. DIGITS  (ASCII 48 - 57  ->  '0' to '9')
        System.out.println();
        System.out.println("================================");
        System.out.println("NUMBERS ONLY");
        System.out.println("================================");
        displayAsciiRange(48, 57);

        // 3. SPECIAL CHARACTERS  (several separated ranges)
        //    These ranges sit in the "gaps" between the letters and the
        //    digits in the ASCII chart, so they have to be printed one
        //    block at a time.
        System.out.println();
        System.out.println("================================");
        System.out.println("VARIOUS SPECIAL CHARACTERS");
        System.out.println("================================");

        // 32 - 47 : space  !  "  #  $  %  &  '  (  )  *  +  ,  -  .  /
        System.out.println();
        System.out.println("-- Punctuation (32 - 47) --");
        displayAsciiRange(32, 47);

        // 58 - 64 : :  ;  <  =  >  ?  @
        System.out.println();
        System.out.println("-- Symbols (58 - 64) --");
        displayAsciiRange(58, 64);

        // 91 - 96 : [  \  ]  ^  _  `
        System.out.println();
        System.out.println("-- Brackets & related (91 - 96) --");
        displayAsciiRange(91, 96);

        // 123 - 126 : {  |  }  ~
        System.out.println();
        System.out.println("-- Braces & tilde (123 - 126) --");
        displayAsciiRange(123, 126);

        // 4. GOING THE OTHER WAY:  char -> int
        //    Here we take each character out of a String and cast it
        //    BACK to an integer. This shows the numeric code that is
        //    stored behind every letter we type.
        System.out.println();
        System.out.println("========================================");
        System.out.println("PRINTING CHARACTER NUMBERS FROM A STRING");
        System.out.println("========================================");

        String strText = "SAMPLETEXT";

        // Walk through the String one character at a time.
        for (int intIndex = 0; intIndex < strText.length(); intIndex++) {

            // chrThisCharacter holds the character pulled out of the String.
            chrThisCharacter = strText.charAt(intIndex);

            // Cast the character back to an int to reveal its ASCII code.
            int intDecimalNumber = (int) chrThisCharacter;

            // Show the character next to its numeric value.
            System.out.println(chrThisCharacter + " = " + intDecimalNumber);
        }
    }

    /**
     * Prints every decimal number in the given range together with the
     * character it represents.
     *
     * We keep the counter (intDecimalNumber) and the converted character
     * (chrThisCharacter) as two separate variables so that the logic is
     * clear: one holds the NUMBER, the other holds the CHARACTER that
     * the number maps to. This separation also makes the printed line
     * easier to read and reason about.
     *
     * @param intStart the first decimal value to display (inclusive)
     * @param intEnd   the last  decimal value to display (inclusive)
     */
    public static void displayAsciiRange(int intStart, int intEnd) {

        // intDecimalNumber is the loop counter AND the numeric value we
        // want to convert. chrThisCharacter holds the character form of
        // that number, so the two ideas stay visually separate.
        int intDecimalNumber;
        char chrThisCharacter;

        for (intDecimalNumber = intStart; intDecimalNumber <= intEnd; intDecimalNumber++) {

            // (char)number is a CAST - it tells Java to treat the integer
            // as the character whose code is that number.
            chrThisCharacter = (char) intDecimalNumber;

            // Print the number first, then the character it maps to.
            System.out.println(intDecimalNumber + " = " + chrThisCharacter);
        }
    }
}
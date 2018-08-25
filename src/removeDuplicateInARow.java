/**
 * This class implements Task where is necessary to remove duplicated characters from input string.
 * If two neighbor characters are the same - remove both of them.
 * Examples:
 * 1. aaabc => abc
 * 2. baab => ""
 */
public class removeDuplicateInARow {
    /**
     * Analyse input string and remove neighbor characters if they are the same
     * @param inStr input string
     * @return output string
     */
    static String removeDup(String inStr) {
        // convert input sting into Array of characters to be able read/write via index
        char[] outStr = inStr.toCharArray();
        if (inStr.isEmpty())
            return "";

        //current position of character in result string to be compared with current character in input string
        int j = 0;

        for (int i=1; i < outStr.length; i++) {
            // if result string is not empty compare current character in output string with character in input string
            if ((j >= 0) && (outStr[j] == outStr[i])) {
                // if characters are the same then decrement current character in output string
                // it means that this character is duplicated and it wil be removed from result string
                j--;
            }
            else {
                // the characters are not the same increment last character index in result "string" and copy from
                // position i
                j++;
                outStr[j] = outStr[i];
            }
        }
        // j is pointed to the last character in output "string". Create string from array and return
        // if j == -1 (it means that all characters are removed from input string)
        //   then empty ("") string will be returned
        return  new String(outStr, 0, j+1);
    }
}

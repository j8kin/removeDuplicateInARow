public class removeDuplicateInARow {
    static String removeDup(String inStr) {
        char[] outStr = inStr.toCharArray();
        if (inStr.isEmpty())
            return "";

        int j = 0;

        for (int i=1; i < outStr.length; i++) {

            if ((j >= 0) && (outStr[j] == outStr[i])) {
                j--;
            }
            else {
                j++;
                outStr[j] = outStr[i];
            }
        }
        return  new String(outStr, 0, j+1);
    }
}

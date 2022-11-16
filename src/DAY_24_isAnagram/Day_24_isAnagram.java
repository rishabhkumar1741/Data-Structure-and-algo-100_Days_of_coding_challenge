package DAY_24_isAnagram;

import java.sql.Array;
import java.util.*;;

public class Day_24_isAnagram {
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        int counta = 0;
        int countb = 0;
        for (int i = 0; i < a.length(); i++) {
            char key_ch = a.charAt(i);
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(j) == key_ch) {
                    counta++;
                }
                if (b.charAt(j) == key_ch) {
                    countb++;
                }
            }
            if (countb != counta) {
                return false;
            }
        }

        return true;

        // Complete the function

    }

    public static void main(String[] args) {
        

    }

}

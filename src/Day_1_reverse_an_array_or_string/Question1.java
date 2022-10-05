package Day_1_reverse_an_array_or_string;

public class Question1 {

    public static String reverseWord(String str) {
        String newString = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newString = newString + str.charAt(i);
        }
        return newString;
    }
    public static void main(String[] args) {
        
    }

   

}

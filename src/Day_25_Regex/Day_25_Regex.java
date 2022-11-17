package Day_25_Regex;
import java.util.Scanner;
import java.util.regex.*;

 class Solution
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String pattern = in.nextLine();
              //Write your code
              try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}

public class Day_25_Regex{
    public static void main(String[] args) {
        
    }
}
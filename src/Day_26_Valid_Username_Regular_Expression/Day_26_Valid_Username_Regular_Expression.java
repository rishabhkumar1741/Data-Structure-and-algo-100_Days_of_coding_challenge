package Day_26_Valid_Username_Regular_Expression;
import java.util.*;;
class UsernameValidator {

     public static final String regularExpression =
 "^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}

class Day_26_Valid_Username_Regular_Expression{
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }

}
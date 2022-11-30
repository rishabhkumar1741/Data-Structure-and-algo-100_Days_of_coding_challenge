package Day_30_Check_if_given_strings_are_rotations_of_each_other_or_not;
import java.util.*;
import java.util.Collections;
public class Day_30_Check_if_given_strings_are_rotations_of_each_other_or_not {
    public static boolean check_rotation(String s1, String goal) {
        if (s1.length() != goal.length()) {
            return false;
        }
        Queue<Character> q1 = new LinkedList<>();
        Queue<Character> q2 = new LinkedList<>();
        for (int i = 0; i < s1.length(); i++) {
            q1.add(s1.charAt(i));
        }

        for (int i = 0; i < goal.length(); i++) {
            q2.add(goal.charAt(i));
        }
        int k = goal.length();

        while (k > 0) {
            k--;
            char data = q1.peek();
            q1.remove();
            q1.add(data);

            if (q1.equals(q2)) {
                return true;
            }

        }
        return false;

    }

    public static void main(String[] args) {
        String S1 = "ABCD";
        String S2 = "CDAB";
        System.out.println(check_rotation("AACD", "ACDA"));

    }
    
}

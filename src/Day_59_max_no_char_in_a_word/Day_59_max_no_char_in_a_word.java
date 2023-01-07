package Day_59_max_no_char_in_a_word;
import java.util.*;
public class Day_59_max_no_char_in_a_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int max =0;
        String[] arrofstr = str.split(" ");
        for(int i=0;i<arrofstr.length;i++)
        {
            if(max<arrofstr[i].length())
            {
                max = arrofstr[i].length();
            }
        }
        System.out.println(max);

    }
    
}

package Day_58_no_of_occurrences;
import java.util.*;

public class Day_58_no_of_occurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int u = sc.nextInt();
        int x = sc.nextInt();
        int count=0;
        for(int i=l;i<=u;i++)
        {
            if(i<9)
            {
                if(x==i)
                {
                    count++;
                }
            }
            else{
                int temp=i;
                while(temp!=0)
                {
                    int digitone = temp%10;
                    if(digitone==x)
                    {
                        count++;
                    }
                    temp =temp/10;
                }
            }
        }
        System.out.println(count);


    }
    
}

package Day_60_chocolate_factory;
import java.util.*;

public class Day_60_chocolate_factory {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x = sc.nextInt();
        int countzero=0;
        int packet[]=new int[x];
        for(int i=0;i<x;i++)
        {
            packet[i] = sc.nextInt();
        }

        for(int i=0;i<x;i++)
        {
            if(packet[i]!=0)
            {
                System.out.print(packet[i]+" ");
            }
            else{
                countzero++;
            }
        }
        for (int i = 0; i < countzero; i++) {
            System.out.print(0+" ");
        }
        

        
    }
    
}

package EveryDay;
import java.util.*;
public class Solution {
    public static void sort012(int a[], int n)
    {
        int zero = 0;
        int one =0;
        int two = 0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==0)
            {
                zero++;
            }
            else if(a[i]==1)
            {
                one++;
            }
            else{
                two++;
            }
        }
        for(int u=0;u<zero;u++)
        {
            System.out.print(0+" ");
        }
        for(int j=0;j<one;j++)
        {
            System.out.print(1+" ");
        }
        for(int z=0;z<two;z++)
        {
            System.out.print(2+" ");
        }
    }


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         
            int[] x = new int[]{0, 2, 1, 2, 0};
            sort012(x, 5);

    }
}
package Day_15_Max_SubArray;
import java.util.*;
import java.lang.Math;

public class Day_15_Max_SubArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, -2, 5};
        int sum =0;
        int maxsum=arr[0];
        for (int i = 0; i < arr.length; i++) {
            sum = sum +arr[i];
            maxsum  = Math.max(maxsum, sum);
            if(sum<0)
            {
                sum =0;
            }
        }
        System.out.println(maxsum);        
    }
    
}

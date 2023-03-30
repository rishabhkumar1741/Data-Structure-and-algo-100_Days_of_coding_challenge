package Day_99_Repeat_and_Missing_Number_Array;

import java.util.Arrays;
 class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        int arr[] = new int[A.length+1];
        int arr1[] = new int[2];
        Arrays.sort(A);
        for (int i : A) {
            arr[i] = arr[i]+1;
        }
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==2)
            {
                arr1[0]=i;
            }
            if(arr[i]==0)
            {
                arr1[1]=i;
            }
        }
        return arr1;
        
        
        
    }
}


public class Day_99_Repeat_and_Missing_Number_Array {
    
}

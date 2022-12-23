package Day_43_Shuffle_the_Array;
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] newarr = new int[nums.length];
        int x=0;
        int y=n;
        int arrindex=0;
        for(int i =0;i<n;i++)
        {
            newarr[arrindex]= nums[x];
            arrindex++;
            x++;
            newarr[arrindex]=nums[y];
            arrindex++;
            y++;
        }
        return newarr;
    
        
    }
}

public class Day_43_Shuffle_the_Array {
    
}

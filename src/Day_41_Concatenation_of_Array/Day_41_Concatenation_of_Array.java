package Day_41_Concatenation_of_Array;
class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] arr = new int[nums.length *2];
        for(int i=0;i<nums.length;i++)
        {
            arr[i] = nums[i];
        }

        for(int i=0;i<nums.length;i++)
        {
            arr[len] = nums[i];
            len++;
        }
        return arr;
         
    }
}

public class Day_41_Concatenation_of_Array {

    
}

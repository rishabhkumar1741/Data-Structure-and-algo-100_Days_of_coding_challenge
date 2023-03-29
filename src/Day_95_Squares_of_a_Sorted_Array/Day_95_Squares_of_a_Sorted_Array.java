package Day_95_Squares_of_a_Sorted_Array;

import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] arr = new int[nums.length];
        int l =0;
        int r = nums.length-1;
        int idx = nums.length-1;

        while(l<=r)
        {
            if(Math.abs(nums[l])>Math.abs(nums[r]))
            {
                arr[idx] = nums[l]*nums[l];
                l++;
                idx--;
            }
            else{
                arr[idx] = nums[r]*nums[r];
                r--;
                idx--;
            }
        }
        return arr;
    }
}

      


class Day_95_Squares_of_a_Sorted_Array{

}
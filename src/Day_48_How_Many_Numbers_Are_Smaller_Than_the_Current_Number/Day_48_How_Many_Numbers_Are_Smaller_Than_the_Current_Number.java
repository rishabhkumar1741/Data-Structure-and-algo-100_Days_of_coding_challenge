package Day_48_How_Many_Numbers_Are_Smaller_Than_the_Current_Number;
import java.util.*;
public class Day_48_How_Many_Numbers_Are_Smaller_Than_the_Current_Number {
    
}


class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int numsClone[] = nums.clone(); 
        Arrays.sort(nums);
       for(int i = 0 ; i < nums.length;i++) {
           if(!map.containsKey(nums[i])) {
               map.put(nums[i],i);
           }
            
        }
        int[] result = new int[nums.length];
        for(int i = 0 ; i < numsClone.length;i++) {
           result[i] = map.get(numsClone[i]); 
        }
        return result;
    }
}
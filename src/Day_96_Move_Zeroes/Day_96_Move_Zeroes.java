package Day_96_Move_Zeroes;
class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[j] = nums[i];
                j++;
            }
        }
        for(int i=j;i<nums.length;i++)
        {
            nums[i]=0;
        }
        
        
        
    }
}
public class Day_96_Move_Zeroes {
    
}

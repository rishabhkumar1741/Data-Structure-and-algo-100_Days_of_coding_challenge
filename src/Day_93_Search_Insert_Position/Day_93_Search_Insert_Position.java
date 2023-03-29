package Day_93_Search_Insert_Position;
import java.util.Arrays;
class Solution {
    public static int binarysearch(int arr[],int target)
    {
        int start=0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]<target)
            {
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
    public int searchInsert(int[] nums, int target) {
        int x = binarysearch(nums,target);
        if(x!=-1)
        {
            return x;
        }
        else{
            int newarr[]= new int[nums.length+1];
            for(int i=0;i<nums.length;i++)
            {
                newarr[i]=nums[i];
            }
            newarr[newarr.length-1]= target;
            Arrays.sort(newarr);
            return binarysearch(newarr,target);
        }
    }
}

public class Day_93_Search_Insert_Position {
    
}

package Day_79_Decompress_Run_Length_Encoded_List;

import java.util.*;

class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i = i + 2) {
            int j = 0;
            while (j < nums[i]) {
                j++;
                al.add(nums[i + 1]);
            }
        }
        int[] arr = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            arr[i] = al.get(i);
        }
        return arr;

    }
}

public class Day_79_Decompress_Run_Length_Encoded_List {

}

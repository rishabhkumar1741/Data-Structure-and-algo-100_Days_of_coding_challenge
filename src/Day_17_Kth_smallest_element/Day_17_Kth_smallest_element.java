package Day_17_Kth_smallest_element;
import java.util.*;

public class Day_17_Kth_smallest_element{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        Arrays.sort(arr);
        return arr[k-1];
    } 
    public static void main(String[] args) {
        
        int[] arr = {7,10,4,3,20,15};
        int N = arr.length;
        int K = 3;
        System.out.println("======================>");
        System.out.println(kthSmallest(arr,0,N-1,K));
        System.out.println("======================>");
        
    }
}
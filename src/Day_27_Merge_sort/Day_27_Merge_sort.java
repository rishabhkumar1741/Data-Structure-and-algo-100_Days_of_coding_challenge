package Day_27_Merge_sort;
import java.util.*;;

public class Day_27_Merge_sort {
    public static void divide(int arr[],int start,int end)
    {
        if(start>=end)
        {
            return;
        }
        int mid = start+(end-start)/2;
        divide(arr, start, mid);
        divide(arr, mid+1, end);
        conquer(arr, start, end, mid);


    }

    public static void conquer(int arr[],int start,int end,int mid)
    {
        int merged[] = new int[end-start+1];
        int arr_index = start;
        int arr2_index = mid+1;
        int x=0;
        while(arr_index<=mid&& arr2_index<=end)
        {
            if(arr[arr_index]<=arr[arr2_index])
            {
                merged[x]= arr[arr_index];
                x++;
                arr_index++;
            }
            else{
                merged[x++] = arr[arr2_index++];
            }
        }

        while(arr_index<=mid)
        {
            merged[x++] = arr[arr_index++];
        }
        while(arr2_index<=end)
        {
            merged[x++]= arr[arr2_index++];
        }

        for (int i = 0,j=start; i < merged.length; i++,j++) {
            arr[j]=merged[i];
        }

    }



    public static void main(String[] args) {int arr[] ;
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        arr = new int[size];
        System.out.println("Enter the element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();            
        }
        divide(arr, 0, size-1);
     
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    
}

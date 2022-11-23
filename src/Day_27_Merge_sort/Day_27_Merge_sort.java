package Day_27_Merge_sort;

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



    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        int n = arr.length;
        divide(arr, 0, n-1);
     
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    
}

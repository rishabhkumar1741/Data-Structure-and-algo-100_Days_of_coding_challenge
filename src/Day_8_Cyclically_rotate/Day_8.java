package Day_8_Cyclically_rotate;

public class Day_8 {
    public static void rotate(int arr[], int n)
    {
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=arr[i];
        }
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                arr[0] = arr1[n-1];
            }
            else{
                arr[i]= arr1[i-1];
            }
        }
        
    }
    public static void main(String[] args) {
        int n = 5;
        int A[] = {1, 2, 3, 4, 5};
        rotate(A, n);
        
    }
    
}

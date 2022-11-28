package Day_29_Selection_Sort;
import java.util.Scanner;

public class Day_29_Selection_Sort {
    public static void selectsort(int arr[])
    {
        for (int i = 0; i < arr.length-1; i++) {
            int min =i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min]>arr[j])
                {
                    min = j;
                }
            }
            if(min!=i)
            {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min]= temp;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] ;
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        arr = new int[size];
        System.out.println("Enter the element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();            
        }
        selectsort(arr);

        for (int i : arr) {
            System.out.print(i +" ");
        }

    }
    
}

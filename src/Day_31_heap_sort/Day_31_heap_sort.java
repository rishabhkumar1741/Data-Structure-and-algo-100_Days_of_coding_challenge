package Day_31_heap_sort;
import java.util.*;

public class Day_31_heap_sort {
    public static void sort(int arr[]) {
        int N = arr.length;
        for (int i = N / 2 - 1; i < arr.length; i++) {
            heapify(arr, N, i);
        }
        for (int i = N - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    public static void heapify(int arr[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && arr[l] > arr[largest]) {
            largest = l;
        }

        if (r < n && arr[r] > arr[largest]) {
            largest = r;
        }
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
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
        System.out.println("after Sorting");
        sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
        

    }

}

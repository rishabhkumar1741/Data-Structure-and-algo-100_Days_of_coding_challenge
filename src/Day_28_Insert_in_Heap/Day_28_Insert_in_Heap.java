package Day_28_Insert_in_Heap;

public class Day_28_Insert_in_Heap {
    


    public static void insertNode(int arr[],int size,int value)
    {
        size++;
        arr[size-1]=value;
        // heapify(int arr[], int n,int i);
    }

    public static void main(String[] args) {
        int arr[] = new int[100];
        arr[0]= 10; 
        arr[1]= 5; 
        arr[2]= 3; 
        arr[3]= 2; 
        arr[4]= 4;
        int n = 5;
        int key = 15;
        insertNode(arr, n,key );

        for (int data : arr) {
            if(data!=0)
            {
                System.out.print(data+" ");
            }
            else{
                break;
            }
        }
    }
    
}

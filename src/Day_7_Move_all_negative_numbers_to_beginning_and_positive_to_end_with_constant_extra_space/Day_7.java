package Day_7_Move_all_negative_numbers_to_beginning_and_positive_to_end_with_constant_extra_space;



public class Day_7 {
    public static void main(String[] args) {
        int arr[] = new int[] {-1, -12,-10 ,1,5,70,3};
        int start = 0;
        int end = arr.length - 1;
        int lengthOfArray = arr.length;
        int mid = start;

        // check for Empty array
        if(lengthOfArray==0)
        {
            System.out.println("Array is Empty ");
            return;
        }
        // check for 1 Element is present
        if(lengthOfArray==1)
        {
            System.out.println("Array have only 1 element");
            System.out.print(arr[start]);
            return;
        }
        // check for 2 element is present
        if(lengthOfArray==2)
        {
            if(arr[start]>arr[end])
            {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end]= temp;
            }
            for (int i : arr) {
                System.out.print(i+" ");
            }
            return;
        }

        //check for more then two element
        
        while(mid<=end)
        {
            if(arr[mid]>=0)
            {
                int temp = arr[mid];
                arr[mid] = arr[end];
                arr[end] = temp;
                end--;
            }
            else if(arr[mid]<0)
            {
                int temp = arr[mid];
                arr[mid] = arr[start];
                arr[start] = temp;
                start++;
                mid++;
            }
        }
        for (int i : arr) {
            System.out.print( i +" ");
        }
    }

}

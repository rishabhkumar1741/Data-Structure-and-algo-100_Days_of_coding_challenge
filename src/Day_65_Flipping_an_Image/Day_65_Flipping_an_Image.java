package Day_65_Flipping_an_Image;

class Solution {
    public static void reverse(int[]arr)
    {
        int end = arr.length ;
        for(int i =0 ;i<(arr.length/2);i++)
        {
            int temp = arr[end-1-i];
            arr[end-i-1] = arr[i];
            arr[i] = temp;
        }
    }
    public static void image(int[]arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                arr[i]=1;
            }
            else{
                arr[i]=0;
            }
        }
    }
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++)
        {
            reverse(image[i]);
            image(image[i]);
        }
        return image;
        
        
    }
}

public class Day_65_Flipping_an_Image {
    
}

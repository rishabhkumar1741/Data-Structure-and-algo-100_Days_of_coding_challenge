package Day_21_find_the_subArray_with_the_given_sum;
import java.util.HashMap;

public class Day_21_find_the_subArray_with_the_given_sum {
    public static void main(String[] args) {
        int arr[]  = {10,15,-5,15,-10,5};
        int cursumm=0;
        int start=0;
        int end=-1;
        int sum =20;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            cursumm+=arr[i];
            if(cursumm-sum==0)
            {
                start=0;
                end=i;
                break;
            }
            if(map.containsKey(cursumm-sum))
            {
                start=map.get(cursumm-sum)+1;
                end= i;
                break;
            }
            map.put(cursumm, i);
        }
        if(end==-1)
        {
            System.out.println("Not Found ");
        }
        else{
            System.out.println(start+" "+end);
        }

        
        
        
    }
    
}

package Day_22_Count_Distinct_Elements_in_every_Window_of_size_k;
import java.util.HashMap;

public class Day_22_Count_Distinct_Elements_in_every_Window_of_size_k {
    static void countDistinctElement(int a[],int k)
    {
        HashMap<Integer,Integer> obj = new HashMap<>();
        for(int i=0;i<k;i++)
        {
            obj.put(a[i], obj.getOrDefault(a[i], 0)+1);
        }
        System.out.println(obj.size());
        for(int i=k;i<a.length;i++)
        {
            if(obj.get(a[i-k])==1)
            {
                obj.remove(a[i-k]);
            }
            else{
                obj.put(a[i-k],obj.getOrDefault(a[i-k], 0)-1);
            }
            obj.put(a[i],obj.getOrDefault(a[i],0)+1);
            System.out.println(obj.size());
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,2,1,3,1,1,3};
        countDistinctElement(arr, 4);


    }
    
}

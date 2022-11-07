package DAY_18_Union_of_two_arrays;
import java.util.*;

public class DAY_18_Union_of_two_arrays {
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        int c[]= new int[100000];
        int j=0;
        
        for(int i =0;i<n;i++)
        {
            c[i]=a[i];
        }
        j=n;
        for(int i=0;i<m;i++)
        {
            c[j]=b[i];
            j++;
            
        }
        Arrays.sort(c);
        int count=0;
        for(int i=1;i<c.length;i++)
        {
            if(c[i-1]!=c[i])
            {
                count++;
            }
        }
        
        return count;
        
    }

    
}

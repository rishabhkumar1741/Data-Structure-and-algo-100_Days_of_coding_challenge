package Day_4_consists_of_only_0_1_and_2_Sort_the_array_without_using_any_sorting_algo;

public class Question4 {
    public static void sort012(int a[], int n)
    {
        int zero = 0;
        int one =0;
        int two = 0;
        int index =0;
        for(int i=0;i<n;i++)
        {
            if(a[i]==0)
            {
                zero++;
            }
            else if(a[i]==1)
            {
                one++;
            }
            else{
                two++;
            }
        }
        
        for(int u=0;u<zero;u++)
        {
            a[index]= 0;
            index++;
        }
        for(int j=0;j<one;j++)
        {
            a[index]= 1;
            index++;
        }
        for(int z=0;z<two;z++)
        {
            a[index]= 2;
            index++;
        }
    }
    
}

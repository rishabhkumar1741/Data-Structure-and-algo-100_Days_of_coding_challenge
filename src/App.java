
import java.util.Arrays;
public class App {
    public static void main(String[] args) {
        int[] nums=new int[]{6,5,4,8};
        int count=0;
        for(int i=0;i<nums.length;i++)
        {

            for(int j=0;j<nums.length;j++)
            {
                
                if(nums[i]>nums[j] )
                {
                    System.out.println(nums[i]+">"+ nums[j]);
                    count++;

                }

            }

            nums[i]=count;
            count=0;
        }


        System.out.println(Arrays.toString(nums));
    }
}





package Day_61_sum_of_no_of_set_bit;

import java.util.*;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

import java.lang.Math;

public class Day_61_sum_of_no_of_set_bit {
    public static int convertBinaryToNumber(int x)
    {
        int i=0;
        int sum =0;
        int temp;
        while(x!=0)
        {
            temp = x%10;
            sum = sum + temp*(int)Math.pow(2, i);
            x =x/10;
            i++;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(convertBinaryToNumber(1011));
        
    }
    
}

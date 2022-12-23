package Day_42_Final_Value_of_Variable_After_Performing_Operations;
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X=0;
        for(String x :operations)
        {
            switch(x)
            {
                case "X++":
                X++;
                break;

                case "++X":
                ++X;
                break;

                case "X--":
                X--;
                break;

                case "--X":
                --X;
                break;
            }
        }
        return X;
        
    }
}

public class Day_42_Final_Value_of_Variable_After_Performing_Operations {
    
}

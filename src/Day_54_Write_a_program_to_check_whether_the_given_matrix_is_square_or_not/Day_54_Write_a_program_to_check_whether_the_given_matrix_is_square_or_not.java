package Day_54_Write_a_program_to_check_whether_the_given_matrix_is_square_or_not;
import java.util.*;
public class Day_54_Write_a_program_to_check_whether_the_given_matrix_is_square_or_not{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        for(int i=0 ;i<row ;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0 ;i<row ;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        if(row==col)
        {
            System.out.println("The entered array is a square matrix.");
        }
        else{
            System.out.println("The entered array is not a square matrix.");
        }        
        
    }
}
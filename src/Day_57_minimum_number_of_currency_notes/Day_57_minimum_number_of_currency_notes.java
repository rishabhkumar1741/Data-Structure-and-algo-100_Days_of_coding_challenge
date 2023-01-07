package Day_57_minimum_number_of_currency_notes;

import java.util.Scanner;

public class Day_57_minimum_number_of_currency_notes {
    public static void main(String[] args) {
        int notes[] = new int[]{100,50,20,10,5,2,1};
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();
        int noofnotes=0;
        int i=0;
        while(amount!=0)
        {
            int temp=0;
            if(amount>=notes[i])
            {
                temp = amount/notes[i];
                noofnotes= noofnotes+temp;
                amount = amount-notes[i]*temp;
            }
            else{
                i++;
            }
        }
        System.out.println(noofnotes);
    }
    
}

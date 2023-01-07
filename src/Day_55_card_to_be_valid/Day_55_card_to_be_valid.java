package Day_55_card_to_be_valid;

import java.util.*;

public class Day_55_card_to_be_valid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long x = sc.nextLong();
        Long duplicatex = x;
        System.out.println(x);
        String str = Long.toString(x);
        int arr[] = new int[str.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (x % 10);
            x = x / 10;
        }
        int even = 0;
        for (int i = 1; i < arr.length; i = i + 2) {
            int ans = arr[i] * 2;
            if (ans < 10) {
                even = even + ans;
            } else {
                int divandsum = 0;
                while (ans > 0) {
                    divandsum = divandsum + ans % 10;
                    ans = ans / 10;
                }
                even = even + divandsum;
            }
        }
        int odd = 0;
        for (int i = 0; i < arr.length; i = i + 2) {
            odd = odd + arr[i];
        }

        int sumofoddeven = odd + even;
        if (sumofoddeven % 10 == 0) {
            System.out.println(duplicatex + " is valid");
        } else {
            System.out.println(duplicatex + " is invalid");

        }
    }
}

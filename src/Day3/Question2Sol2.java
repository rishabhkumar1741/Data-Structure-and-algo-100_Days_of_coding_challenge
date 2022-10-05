package Day3;

public class Question2Sol2 {
    static class Pair {
        int min, max;
    }

    public static Pair checkMinMaxUsingTournamentMethod(int arr[], int start, int end) {

        // check for 1 element in array
        Pair minMax = new Pair();
        Pair finalRoundPlayer1 = new Pair();
        Pair finalRoundPlayer2 = new Pair();

        if (start == end) {
            minMax.max = arr[start];
            minMax.min = arr[start];
            return minMax;
        }
        // check for 2 element in array
        if (end == (start - 1)) {
            if (arr[start] > arr[end]) {
                minMax.max = arr[start];
                minMax.min = arr[end];
            } else {
                minMax.max = arr[end];
                minMax.min = arr[start];
            }
            return minMax;
        }
        // check for more then 2 element
        int mid = (start + end) / 2;
        finalRoundPlayer1 = checkMinMaxUsingTournamentMethod(arr, start, mid);
        finalRoundPlayer2 = checkMinMaxUsingTournamentMethod(arr, mid + 1, end);
        if (finalRoundPlayer2.min > finalRoundPlayer1.min) {
            minMax.min = finalRoundPlayer1.min;
        } else {
            minMax.min = finalRoundPlayer2.min;
        }

        if (finalRoundPlayer2.max > finalRoundPlayer1.max) {
            minMax.max = finalRoundPlayer2.max;
        } else {
            minMax.max = finalRoundPlayer1.max;
        }

        return minMax;
    }

    public static void main(String[] args) {
        int arr[] = { 1000, 11, 2, 0, 445, 1, 330, 3000, 5000 };
        int arr_size = arr.length;
        Pair minmax = checkMinMaxUsingTournamentMethod(arr, 0, arr_size - 1);
        System.out.printf("\nMinimum element is %d",
                minmax.min);
        System.out.printf("\nMaximum element is %d",
                minmax.max);

    }

}

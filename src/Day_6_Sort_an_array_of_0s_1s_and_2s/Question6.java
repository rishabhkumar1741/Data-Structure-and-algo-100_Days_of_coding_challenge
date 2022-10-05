package Day_6_Sort_an_array_of_0s_1s_and_2s;



public class Question6 {

	public static void pointerApproach(int arr[], int size) {
		System.out.println("Before shorting");
		for (int x : arr) {
			System.out.print(x + " ");
		}
		System.out.println();


		int low = 0;
		int high = size;
		int mid = 0;
		while (mid >= low && mid <= high) {
			switch (arr[mid]) {
				case 0: {
					int temp = arr[low];
					arr[low] = arr[mid];
					arr[mid] = temp;
					low++;
					mid++;
					break;
				}
				case 1: {
					mid++;
					break;
				}
				case 2: {
					int temp = arr[high];
					arr[high] = arr[mid];
					arr[mid] = temp;
					high--;

					break;
				}
			}
		}
		System.out.println("After shorting");
		for (int x : arr) {
			System.out.print(x + " ");
		}

	}

	public static void main(String[] args) {
		int arr[] = new int[] { 0, 1, 2, 0, 1, 2,2,0,0};
		int size = arr.length - 1;
		pointerApproach(arr, size);

	}

}

// This code is contributed by Tapesh (tapeshdua420)

package EveryDay;

import java.util.Scanner;

import javax.swing.text.Position;

import java.util.*;

public class Question6 {

	public static void pointerApproach(int arr[], int size) {
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
		for (int x : arr) {
			System.out.print(x + " ");
		}

	}

	public static void main(String[] args) {
		int arr[] = new int[] { 0, 1, 2, 0, 1, 2 };
		int size = arr.length - 1;
		pointerApproach(arr, size);

	}

}

// This code is contributed by Tapesh (tapeshdua420)

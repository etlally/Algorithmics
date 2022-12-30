package Exercices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {

	public static void main(String[] args) {
		int[] a = { 2, 9, 1, 2, 6, 8 };

		// Unsorted array
		System.out.println("Unsorted Array: " + Arrays.toString(a));

		// call quickSort
		quickSort(a, 0, a.length - 1);

		// Sorted array
		System.out.println("Sorted Array: " + Arrays.toString(a));

		// Make Unique
		System.out.println("Unique elements Array: " + makeUnique(a));

	}

	private static int partition(int[] a, int left, int right) {

		int p = a[right];
		int leftIndex = left;
		int rightIndex = right;

		/*
		 * Compare each number from the leftIndex to the end of the array
		 */
		while (leftIndex < rightIndex) {

			/*
			 * Traverse from the left to the right until a greater or equal number than the
			 * pivot is found or the rightIndex and the leftIndex are in the same position
			 */
			while (a[leftIndex] <= p && leftIndex < rightIndex) {
				leftIndex++;
			}

			/*
			 * Traverse from the right to the left until a smaller or equal number than the
			 * pivot is found or the rightIndex and the leftIndex are in the same position
			 */
			while (a[rightIndex] >= p && leftIndex < rightIndex) {
				rightIndex--;
			}
			/*
			 * When the number on the leftIndex is greater than the pivot or the number on
			 * the rightIndex is smaller than the pivot, swap the numbers
			 */
			swap(a, leftIndex, rightIndex);
		}

		/*
		 * When the leftIndex and the rightIndex are in the same position swap the
		 * number on that position with the pivot
		 */

		if (a[leftIndex] > a[right]) {
			swap(a, leftIndex, right);
		} else {
			leftIndex = right;
		}
		return leftIndex;
	}

	private static void swap(int[] a, int leftIndex, int rightIndex) {
		int temp = a[leftIndex];
		a[leftIndex] = a[rightIndex];
		a[rightIndex] = temp;

	}

	private static void quickSort(int[] a, int left, int right) {

		if (left < right) {

			int partitionIndex = partition(a, left, right);

			quickSort(a, left, partitionIndex - 1);
			quickSort(a, partitionIndex + 1, right);
		}
	}

	/*
	 * To remove the duplicate "2" from the array given, I created a new ArrayList
	 * called output. Then using a for loop,traverse through all elements of the
	 * array, and only unique elements will be added to the new array.
	 */
	public static List<Integer> makeUnique(int[] array) {
		List<Integer> output = new ArrayList<>();

		for (Integer i : array) {
			if (!output.contains(i)) {
				output.add(i);
			}
		}

		return output;

	}

}

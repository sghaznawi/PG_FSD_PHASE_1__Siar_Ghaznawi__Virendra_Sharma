package Assignments;

public class binarySearch {

	public static int runBinarySearchIteratively(int[] sortedArray, int key, int low, int high) {
		int index = Integer.MAX_VALUE;

		while (low <= high) {
			int mid = low + ((high - low) / 2);
			if (sortedArray[mid] < key) {
				low = mid + 1;
			} else if (sortedArray[mid] > key) {
				high = mid - 1;
			} else if (sortedArray[mid] == key) {
				index = mid;
				break;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 5, 8, 23, 26, 23, 38, 56, 72, 91 };
		System.out.println(runBinarySearchIteratively(arr,23,0,10));
	}

}

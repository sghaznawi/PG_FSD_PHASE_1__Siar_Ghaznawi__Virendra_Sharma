package Assignments;

import java.util.Iterator;

public class arrayRotation {

	public static void main(String[] args) {
		int [] arr = {4,9,2,5,1,3};
		int n=3;
		System.out.print("Original Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		for (int i = 0; i < n; i++) {
			for( int index =arr.ength-2; index >= 0 ; index-- )
	            arr[index+1] = arr [index];

	        // wrap last element into first slot
	        arr[0] = last;
		}
		
		
		
		System.out.print("After rotation Array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}

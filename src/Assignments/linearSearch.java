package Assignments;

public class linearSearch {
// This program will search for a specific number in an array
	public static void main(String[] args) {
int [] arr = {5,13,90,10,7,12,11,2,15};
int location=0;
int n=12;
for(int i =0; i<arr.length;i++) {
	if (arr[i]==n) location =i;
}
System.out.println("the location of 12th element is: " + location);

	}

}

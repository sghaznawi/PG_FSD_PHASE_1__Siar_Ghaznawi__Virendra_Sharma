package Assignments;

public class thirdSmallestElement {

	static void Print3Smallest(int array[], int n)
    {
            int firstmin = Integer.MAX_VALUE;
            int secmin = Integer.MAX_VALUE;
            int thirdmin = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++)
            {
                /* Check if current element is less than
                firstmin, then update first, second and
                third */
                if (array[i] < firstmin)
                {
                    thirdmin = secmin;
                    secmin = firstmin;
                    firstmin = array[i];
                }
         
                /* Check if current element is less than
                secmin then update second and third */
                else if (array[i] < secmin)
                {
                    thirdmin = secmin;
                    secmin = array[i];
                }
         
                /* Check if current element is less than
                then update third */
                else if (array[i] < thirdmin)
                    thirdmin = array[i];
            }
         
            System.out.println("First min = " + firstmin );
            System.out.println("Second min = " + secmin );
            System.out.println("Third min = " + thirdmin );
    }
     
    // Driver code
    public static void main(String[] args)
    {
            int array[] = {4, 9, 1, 32, 12,8,6,0};
            int n = array.length;
            Print3Smallest(array, n);
    }
     
}
 

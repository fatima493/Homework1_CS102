import java.util.Random;           
import java.util.Scanner;

// 1.Generate an array of random integers in the range [0, 100]
public class ArrayOperations {

 
    }

    // 2. Find the minimum value in the array
    public static int findMin(int[] array) {

    }

    // 3. Find the maximum value in the array
    public static int findMax(int[] array) {

    }

    // 4. Calculate and display the average, and differences from the average
    public static void calculateAverageAndDifferences(int[] array) {
      int sum = 0;
     // Find the sum of the numbers
        for (int num : array) {
            sum += num;
        }
     // Find the average (I decided to convert sum into a double to get more precise results)
        double average = (double)sum/array.length;
        System.out.println("Average: " + average);

     // Difference of each number and average
        System.out.println("Differences from average:");
        for (int num : array) {
         //In case if the average is really a double, num-double will also be so
            System.out.println(num - average);
        }
    }

    // 5. Calculate and display the sum of elements at odd and even indexes
    public static void calculateSumOfIndexes(int[] array) {

        //Assuming array has at least 2 elements and setting the sums to a default value '0'
        int sumOfEven = 0;
        int sumOfOdd = 0;

        // If index is even it sums to sumOfEven and if it is not it sums to sumOfOdd
        for (int i = 0; i < array.length; i++){
            if ( i % 2 == 0){
                sumOfEven += array[i];
            } else {
                sumOfOdd += array[i];
            }
        }

        //Displaying the sums of odd and even indexes respectively 
        System.out.println("Sum of the odd indexes is " + sumOfOdd);
        System.out.println("Sum of the even indexes is " + sumOfEven);
      
    }

    // Display the menu and get the user input
    public static void main(String[] args) {

}

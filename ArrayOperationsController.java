import java.util.Scanner;

public class ArrayOperationsController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to array operations");
        
        //Ask user for the desired array size
        int arraySize = Input(sc, 2, 100, "Give an array size: ");
        
        //create an array
        int[] array = ArrayOperations.generateRandomArray(arraySize);
        
        while(true){
            switch (Menu(sc)) {
                 case 1:
                    System.out.println("Minimum value: " + ArrayOperations.findMin(array)); //Implement the created array
                    break;
                case 2:
                    System.out.println("Maximum value: " + ArrayOperations.findMax(array)); //Implement the created array
                    break;
                case 3:
                    ArrayOperations.calculateAverageAndDifferences(array); //Implement the created array
                    break;
                case 4:
                    ArrayOperations.calculateSumOfIndexes(array); //Implement the created array
                    break;
                case 5:
                    System.exit(1);
                    break;        
            }
        }
        
    }

    //Menu
    public static int Menu(Scanner sc){
        System.out.println("Menu");
        System.out.println("1.Find the minimum");
        System.out.println("2.Find the maximum");
        System.out.println("3.Find the average");
        System.out.println("4.Find the sum of indexes");
        System.out.println("5.Exit");

        int option = Input(sc,1, 5, "Choose an option: ");
        return option;
    }
    
    
    //Provides the errors for inputs.
    public static int Input(Scanner sc, int minumumInput, int maximumInput, String question){
        int option;
        while(true){
            System.out.print(question);
            if(sc.hasNextInt()){
                option = sc.nextInt();
                if(option>=minumumInput && option<=maximumInput){
                    break;
                }
                System.out.println("Invalid option please enter a valid input.");
            }
        }
        return option;
    }
}

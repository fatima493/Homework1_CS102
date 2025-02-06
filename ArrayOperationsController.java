import java.util.Scanner;

public class ArrayOperationsController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Welcome to array operations");
        
        //Ask user for the desired array size
        int arraySize = Input(sc, 2, 100, "Give an array size: ");
        
        //create an array
        int[] array = ArrayOperations.generateRandomArray(arraySize);
        String arrayString = " ";
        
        //Converting array elements to string
        for(int i : array){
            arrayString += i+" ";
        }
        
        //Calling methods in the arrayOperations class based on the input entered
        while(true){
            switch (Menu(sc, arrayString)) {
                 case 1:
                    System.out.println("Minimum value: " + ArrayOperations.findMin(array)); //Minimum 
                    break;
                case 2:
                    System.out.println("Maximum value: " + ArrayOperations.findMax(array)); //Maximum
                    break;
                case 3:
                    ArrayOperations.calculateAverageAndDifferences(array); //Calculate Average And Differences
                    break;
                case 4:
                    ArrayOperations.calculateSumOfIndexes(array); // Calculate Sum Of Indexes
                    break;
                case 5:
                    System.exit(1); //Exiting from program
                    break;        
            }
        }
        
    }

    //Menu function to present options and return to the given option
    public static int Menu(Scanner sc, String arrayString){
        System.out.println("Menu");
        System.out.println("Your Array:"+ arrayString);
        System.out.println("1.Find the minimum");
        System.out.println("2.Find the maximum");
        System.out.println("3.Find the average");
        System.out.println("4.Find the sum of indexes");
        System.out.println("5.Exit");

        int option = Input(sc,1, 5, "Choose an option: ");
        return option;
    }
    
    
    //Provides the errors for inputs with specified input range
    public static int Input(Scanner sc, int minumumInput, int maximumInput, String question){
        int option;
        while(true){
            
            //Printing question if there is. 
            System.out.print(question);
            
            //Protection against different values than int
            if(sc.hasNextInt()){
                option = sc.nextInt();
                
                //Implemeting range
                if(option>=minumumInput && option<=maximumInput){
                    break;
                }
                System.out.println("Invalid option please enter a valid input.");
            }
        }
        return option;
    }
}

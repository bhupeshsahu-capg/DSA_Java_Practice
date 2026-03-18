
import java.util.Arrays;


public class Practice {
    public static void main(String args[]) {

        //first type of array creation
        int marks[]; //empty array

        //second way to create an array
        int marks_02 [] = {98, 99, 95}; //array with elements

        //third way to create an array
        String [] fruits = {"apple", "banana", "chiku", "Mango"};

        //Updating Array
        marks_02[1] = 100; //Updated the value of the second index
        marks = new int [] {1, 2, 3 ,4, 5};
        //Printing outputs
        System.out.println("Empty Array - " + Arrays.toString(marks));

        System.out.println("Output_01 - " + marks_02[0]);
        System.out.println("Output_02 - " + marks_02[1]);
        System.out.println("Output_03 - " + marks_02[2]);

        //Printing string in the output
        System.out.println("Fruits we are having: " + Arrays.toString(fruits));

        //Linear Search
        int arr[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 10;

        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Found at index " + i);
            } 
        }
        System.out.println("Not found");
    }
} 
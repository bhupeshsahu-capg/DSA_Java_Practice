

public class _13_Recursion {

    public static void printDec(int n) {
        if(n==1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }


    public static void printInc(int n) {
        if(n==1) {
            System.out.print(n + " ");
            return;
        }
        printInc(n-1);
        System.out.print(n + " ");
    }


    public static int factorial(int n) {
        if(n==1) {
            return 1;
        }
        int fact = n * factorial(n-1);
        return fact;
    }


    public static int sumOfNnaturalNumbers(int n){
        if(n == 1) {
            return 1;
        }
        int sum = n + sumOfNnaturalNumbers(n-1);
        return sum;
    }


    public static int NthFibonacciNo(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1) {
            return 1;
        }
        int Fibonacci = NthFibonacciNo(n-1) + NthFibonacciNo(n-2);
        return Fibonacci;
    }


    public static boolean isSorted(int arr[], int i) {
        if(i == arr.length-1) {
            return true;
        }
        if(arr[i] > arr[i+1]) {
            return false;
        }
        return isSorted(arr, i+1);
    }


    public static int firstOccurance(int arr2[], int key, int i) {
        if(i == arr2.length) {
            return -1;
        }
        if(arr2[i] == key) {
            return i;
        } 
        return firstOccurance(arr2, key, i+1);
    }


    public static int lastOccurance(int arr3[], int key, int i) {
        if(i == arr3.length) {
            return -1;
        }
        int isFound = lastOccurance(arr3, key, i+1);
        if(isFound == -1 && arr3[i] == key) {
            return i;
        } 
        return isFound;
    }
    public static void main(String args[]) {
        //Recursion Questions
        //Que - 1: Print numbers from n to 1(Decreasing Order)
        printDec(10);
        System.out.println();

        //Que - 2: Print numbers from 1 to n(increasing Order)
        printInc(10);
        System.out.println();
        System.out.println();

        //Que - 3: Find the factorial of n
        System.out.println("Factorial: " + factorial(5));
        System.out.println();

        //Que - 4: Print Sum of N Natural Numbers
        System.out.println("Sum of N Natural Numbers: " + sumOfNnaturalNumbers(10));
        System.out.println();

        //Que - 5: Print Nth Fibonacci Number
        System.out.println("Nth Fibonacci Number: "+ NthFibonacciNo(7));
        System.out.println("");

        //Que - 6: Check if given array is sorted or not?
        int arr[] = {1, 2, 3, 14, 5};
        System.out.println(isSorted(arr, 0));
        System.out.println("");

        //Que - 7: find the first occurance of an element in an array
        int arr2[] = {3, 5, 6, 12, 5, 90, 3, 53, 76};
        System.out.println(firstOccurance(arr2, 76, 0));
        System.out.println("");

        //Que - 8: find the last occurance of an element in an array
        int arr3[] = {1, 2, 5, 23, 56, 2, 1, 7, 9, 1, 2};
        System.out.println(lastOccurance(arr3, 2, 0));
        System.out.println("");

    }
}

import java.util.*;

public class _06_Functions_Methods {
    //Function without parameter
    public static void printHelloWorld() { //Function
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    //Function with parameters
    public static int calculateSum(int num1, int num2) { //Parameters or formal parameters
        int sum = num1 + num2;
        return sum;
    }

    //Swap function
    public static void swap(int a, int b) {
        //input : a = 3, b = 5
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    //Product Function
    public static int product(int num1, int num2) {
        int product = num1 * num2;
        return product;
    }

    //Factorial of a number
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    //Binomial factorial
    public static void binomialCoefficient (int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_n_r = factorial(n-r);
        System.out.println("Binomial Coefficient : " + (fact_n/(fact_r*fact_n_r )));
    }

    //Function to calculate sum of 2 nums
    public static int sum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }
    //Function to calculate sum of 3 nums
    public static int sum(int num1, int num2, int num3) {
        int sum = num1 + num2 + num3;
        return sum;
    }

    //Check if a number is prime or not?
    public static boolean checkPrime(int num) {
        if(num <= 1) {
            return false;
        } 
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    } 

    //Print all primes in a range
    public static void printPrimesInRange(int n) {
        for(int i = 2; i <= n; i++) {
            if(checkPrime(i) == true) {
                System.out.print(i + " ");
            }
        }
    }

    public static void binToDec (int binNum) {
        int decNum = 0;
        int pow = 0;
        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum /= 10;
        }
        System.out.print("Binary to Decimal : " + decNum);
    }

    public static void decToBin(int decNum){
        int pow = 0;
        int binNum = 0;
        while(decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            decNum /= 2;
        }
        System.out.print("Decimal to Binary : " + binNum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        // System.out.print("Enter value of a : ");
        // int a = sc.nextInt();
        // System.out.print("Enter value of b : ");
        // int b = sc.nextInt();
        System.out.print("Enter value of n : ");
        int n = sc.nextInt();
        
        //Function Call's

        //printHelloWorld();

        //System.out.println("Sum : " + calculateSum(a, b)); //Arguments or Actual parameters
        
        //swap(3, 5); //a = 3, b = 5

        //System.out.println("Product of a & b : " + product(a, b));

        //System.out.println("Factorial of " + n + " : " + factorial(n));

        //binomialCoefficient(a, b);
        
        //------ Example of Function overloading -----
        // System.out.println("Sum of 2 numbers : " + sum(a, b));
        // System.out.println("Sum of 3 numbers : " + sum(a, b, n));

        //System.out.println(checkPrime(n));
        //printPrimesInRange(n);

        //binToDec(n);
        decToBin(n);
    }
}
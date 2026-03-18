import java.util.*;
public class _04_Loops {
    public static void main(String args[]) {
        //============================== for loop ================================
        // for (int i = 0; i <= 10; i++) {
        //     System.out.print(i + " ");
        // }

        //======================== Practice Problems ========================
        //Print Square Pattern
        // for(int i = 1; i <= 4; i++) {
        //     for(int j = 1; j <= 4; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Print reverse of a number
        // int n = 10899;
        // while (n > 0) {
        //     int lastDigit = n % 10;
        //     System.out.print(lastDigit);
        //     n = n/10;
        // }
        // System.out.println();

        //=========================== while ===============================
        // int j = 0;
        // while (j <= 10) {
        //     System.out.print(j + " ");
        //     j++;
        // }

        //==================== Practice Problems =======================
        // int count = 0;
        // while (count < 100) {
        //     System.out.println("Hello World");
        //     count++;
        // }

        //Print numbers from 1 to 10
        // int number = 1;
        // while(number <= 10) {
        //     System.out.print(number + " ");
        //     number++;
        // }  

        //Print from 1 to n
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int num = 1;
        // while (num <= n) {
        //     System.out.print(num + " ");
        //     num++;
        // }

        //Print Sum of first n natural numbers
        // Scanner sc = new Scanner (System.in);
        // int n = sc.nextInt();
        // int i = 1;
        // int sum = 0;
        // while (i <= n) {
        //     sum += i;
        //     i++;
        // }
        // System.out.print(sum);

        //========================= do-while loop ===============================
        // int k = 0;
        // do {
        //     System.out.print(k + " ");
        //         k++;
        // } while(k <= 10);

        //Keep entering numbers till user enters a multiple of 10
        Scanner sc = new Scanner(System.in);
        // do { 
        //     System.out.print("Enter your number : ");
        //     int n = sc.nextInt();
        //     if(n%10 == 0 ) {
        //         break;
        //     }
        //     System.out.println(n);
        // } while (true);

        //Continue Statement
        // for (int i=1; i<=5; i++) {
        //     if (i == 3) {
        //         continue;
        //     }
        //     System.out.println(i);
        // }

        // do { 
        //     System.out.print("enter your number : ");
        //     int n = sc.nextInt();

        //     if (n % 10 == 0) {
        //         continue;
        //     }
        //     System.out.println("number was "+ n);
        // } while (true);

        //check if a number is prime or not
    //     System.out.print("Enter your number : ");
    //     int n = sc.nextInt();
    //     for (int i = 2; i <= n; i++) {
    //         if (n <=1) {
    //             System.out.println("Not Prime"); 
    //             break;
    //         }
    //         if(n%i == 0) {
    //             System.out.println("Not Prime");
    //         }
    //     }
    //             System.out.println("Prime");

    // ========================== Check if a number is Prime Number or Not ======================
    int n = sc.nextInt();
    boolean isPrime = true;
    if (n == 2) {
        System.out.println("Prime Number");
    } else {
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime == true) {
            System.out.println("n is a prime number");
        } else {
            System.out.println("n Not a Prime Number");
        }
    }
    }
}
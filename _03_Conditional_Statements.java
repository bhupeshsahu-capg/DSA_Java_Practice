//import java.util.*;

public class _03_Conditional_Statements {
    public static void main(String args[]) {
        //int age = 25;

        //If - else Statements
        // if (age >= 18) {
        //     System.out.println("Can vote, drive");
        // } 
        // if (age <= 16 && age >= 12) {
        //     System.out.println("Teenager");
        // }
        // else {
        //     System.out.println("Not Adult");
        // }



        // ---------------------------- Practice Question --------------------------
        //Largest of two number 
        // int a = 1, b = 3;
        // if(a > b) {
        //     System.out.println("a is larger");
        // } else {
        //     System.out.println("b is larger");
        // }

        //Print if a number is Odd or Even
        // Scanner sc = new Scanner (System.in);
        // int num = sc.nextInt();
        // if (num % 2 == 0) {
        //     System.out.println("Even Number");
        // } else {
        //     System.out.println("Odd Number");
        // }



        //Else if Statement
        // if(age > 18) {
        //     System.out.println("Adult");
        // } else if (age >= 13 && age < 18) {
        //     System.out.println("Teenager");
        // } else {
        //     System.out.println("Child");
        // }


        //------------------------------Income Tax Calculator------------------------------
        // Scanner sc = new Scanner(System.in);
        // int income = sc.nextInt();
        // if (income <= 500000) {
        //     System.out.println("0% Tax");
        // } else if (income > 500000 && income <= 1000000 ) {
        //     System.out.println("20% Tax: " + (income * 0.2));
        // } else if (income > 1000000) {
        //     System.out.println("30% Tax :" + (income * 0.3));
        // }

        //-------------------Largest of 3 numbers------------------------
        // int a=101, b=30, c=6;
        // if ((a>b) && (a>c)) {
        //     System.out.println("a is largest");
        // } else if ((b > c)) {
        //     System.out.println("b is largest");
        // } else {
        //     System.out.println("c is largest");
        // }


        //------------------------Ternary Operator-------------------------
        // int number = 5;
        // String type = ((number % 2) == 0) ? "Even" : "Odd"; //ternary operator
        // System.out.println(type);

        //Check if a student will pass or fail
        //marks >= 33 : Pass & marks < 33: Fail
        // int marks = 9;
        // String result = (marks >= 33) ? "Pass" : "Fail";
        // System.out.println(result);

        //-------------------------------Switch Statement ------------------------------
        // int number = 5;
        // switch (number) {
        //     case 1: System.out.println("Samosa");
        //     break;

        //     case 2: System.out.println("Burger");
        //     break;

        //     case 3: System.out.println("Mango - Shake");
        //     break;

        //     default : System.out.println("Wake up to reality");
        // }

        //--------------------Calculator using Switch Statements--------------------
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // char Operator = sc.next().charAt(0);

        // switch (Operator) {
        //     case '+': System.out.println("Sum: " + (a+b));
        //     break;
        //     case '-': System.out.println("Sub: " + (a-b));
        //     break;
        //     case '*': System.out.println("Multiply: " + (a*b));
        //     break;
        //     case '/': System.out.println("Divide: " + (a/b));
        //     break;
        //     case '%': System.out.println("Modulo: " + (a%b));
        //     break;
        //     default: System.out.println("Wrong Operator used");
        // }

        //--------------------Practice Questions----------------------
        //Q1. Write a java program to get a number from the user and print
        //whether it is positive or negative. 

        // Scanner sc = new Scanner (System.in);
        // int number = sc.nextInt();
        // switch (number) {
        //     case 1: 
        // }
        // String result = (number >= 0) ? "Positive" : "Negative";
        // System.out.println(result);


        //Q2. Finish the following code so that it prints you have a fever if your 
        // temperature is about 100 and otherwise prints you don't have a fever.
        // double temp = 103.5;
        // String report = (temp > 100) ? "You have a fever" : "You don't have a fever";
        // System.out.println(report);

        //Q3. Write a java program to input week number (1-7) and print day of week name using switch case.
        // Scanner sc = new Scanner (System.in);
        // int num = sc.nextInt();
        // switch (num) {
        //     case 1: System.out.println("Monday");
        //     break;
        //     case 2: System.out.println("Tuesday");
        //     break;
        //     case 3: System.out.println("Wednesday");
        //     break;
        //     case 4: System.out.println("Thursday");
        //     break;
        //     case 5: System.out.println("Friday");
        //     break;
        //     case 6: System.out.println("Saturday");
        //     break;
        //     case 7: System.out.println("Sunday");
        //     break;
        //     default: System.out.println("Enter correct day number");
        // }


        //------------------- Write a java program that takes a year from the user and 
        // print whether year is a leap year or not. ---------------------
        // Scanner sc = new Scanner(System.in);
        // int year = sc.nextInt();
        // String result = (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))? "Leap Year" : "Not a leap year";
        // System.out.println(result);



    }
}
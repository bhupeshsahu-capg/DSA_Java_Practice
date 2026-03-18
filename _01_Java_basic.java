public class _01_Java_basic {

    public static void main(String args[]) {
        //Output in Java

        // System.out.print("Hello World \n"); //line ka space add kr dega
        // System.out.print("Hello World\n"); //line ka space add kr dega
        // System.out.print("Hello World");

        //Pattern

        // System.out.println("****");
        // System.out.println("***");
        // System.out.println("**");
        // System.out.println("*");

        //Variables

        // int a = 10;
        // int b = 5;
        // System.out.println(a);
        // System.out.println(b);
        // String name = "Tony Stark";
        // System.out.println(name);

        // a = b;
        // System.out.println(a);


        //Data Types in Java (Primitive)

        // byte b = 8;
        // System.out.println(b);
        // char ch = 'a';
        // System.out.println(ch);
        // boolean var = false;
        // System.out.println(var);
        // float price = 10.5f;
        // System.out.println(price);
        // int number = 25;
        // System.out.println(number);
        // //long
        // //double
        // short n = 240;
        // System.out.println(n);

        //Sum of two numbers

        // int a = 10;
        // int b = 5;
        // int sum = a + b; 
        // System.out.print(sum);





        //Input in Java
        // Scanner sc = new Scanner(System.in);
        // String input = sc.next(); //single word
        // System.out.println("Your First Name is: " + input);

        // String input2 = sc.nextLine(); //input Sentence 
        // System.out.println("Your full name" + input2);

        // int input3 = sc.nextInt(); //integer value
        // System.out.println("Your Integer value is: " + input3);

        // byte input4 = sc.nextByte();
        // System.out.print("Your Byte input is: " + input4);

        // float input5 = sc.nextFloat();
        // System.out.print("Your Float input is: " + input5);
        
        // double input6 = sc.nextDouble();
        // System.out.print("Your double input is: " + input6);

        // boolean input7 = sc.nextBoolean();
        // System.out.print("Your Boolean input is: " + input7);

        // short input8 = sc.nextShort();
        // System.out.print("Your Short input is: " + input8);
        
        // long input9 = sc.nextLong();
        // System.out.print("Your Long input is: " + input9);





        //Sum and product of a and b (input from user)
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a + b;
        // System.out.println("Sum of a and b:" + sum);
        // int product = a * b;
        // System.out.println("Product of a and b:" + product);


        // Area of circle
        // Scanner sc = new Scanner(System.in);
        // float r = sc.nextFloat();
        // float area = 3.14f * r * r;
        // System.out.println("Area of Circle: " + area);



        //Type conversion in Java
        // Scanner sc = new Scanner(System.in);
        // float number = sc.nextInt(); // This will execute
        // //int number = sc.nextFloat(); //This will show error - lossy conversion
        // System.out.println(number);




        //Type casting in java
        //int marks = 99.99; //Showing error
        // int marks = (int) (99.99); //Lossy conversion but executes
        // System.out.println(marks);


        // ----------------------------Practice Questions-----------------------------

        //In a program, input 3 numbers: A, B, and C. You have to output the average of these 3 numbers.
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // float average = (a+b+c) / 3;
        // System.out.println(average);



        //In a program, input the side of square. You have to output the area of the square.
        // Scanner sc = new Scanner(System.in);
        // int side = sc.nextInt();
        // int area = side * side;
        // System.out.println("Area of square: " + area);



        //Enter cost of 3 items from the user (using float data type) - a pencil, a pen and 
        //an eraser. you have to output the total cost of the items back to the user as their bill. 
        // Scanner sc = new Scanner(System.in);
        // float pen = sc.nextFloat();
        // float pencil = sc.nextFloat();
        // float eraser = sc.nextFloat();
        // float total_cost = pen + pencil + eraser;
        // float bill = (0.18f * total_cost) + total_cost;
        // System.out.println("Total Bill: " + bill + "(including 18% GST. GST Amount: " + 0.18f*total_cost + ")");



    }
}

public class _11_BitManipulation {
    public static void oddEven(int n) {
        int bit = 1;
        if((n & bit) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    //get ith bit
    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if((n & bitMask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    //set ith bit
    public static int setIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n | bitMask;
    }

    //clear ith bit
    public static int clearIthBit(int n, int i) {
        int bitMask = 1 << i;
        return n & (~bitMask);
    }
    public static void main(String args[]) {
        System.out.println(5 & 6); //Bitwise operator AND
        System.out.println(5 | 6); //BITWISE OR
        System.out.println(5 ^ 6); // XOR
        System.out.println(~8); // NOT or 1's complement
        System.out.println(5<<3); //Left Shift Operator
        System.out.println(20>>2); //Right Shift Operator

        //question - check if number is even or odd
        oddEven(4);

        //Get ith bit
        System.out.println(getIthBit(10, 3));

        //Set ith bit
        System.out.println(setIthBit(10, 2));

        //Clear ith bit
        System.out.println(clearIthBit(10, 1));
    }
}
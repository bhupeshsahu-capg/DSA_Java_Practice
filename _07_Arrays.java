

/*
import java.util.*;

public class _07_Arrays {

    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void linearSearch(String fruits[], String value) {
        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals(value)) {
                System.out.println("found at : " + i);
            }
        }
    }

    public static void largestNumber(int nums[]) {
        int largest = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (largest < nums[i]) {
                largest = nums[i];
            }
        }
        System.out.println("Largest number in an array : " + largest);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // int marks[] = new int[50]; //creating array of size - 50
        // int numbers [] = {1, 2, 3};
        // int more_numbers [] = {4, 5, 6};
        //Input
        // System.out.print("Enter Physics marks : ");
        // int phy = sc.nextInt();
        // System.out.print("Enter Maths marks : ");
        // int maths = sc.nextInt();
        // System.out.print("Enter Chem marks : ");
        // int chem = sc.nextInt();
        // int avg = (phy + chem + maths ) / 3;
        // //Update
        // maths += 1;
        // System.out.println("Maths Updated matrks : " + maths);
        // //Output
        // System.out.println("Avg of subjects: " + avg);
        // System.out.println("Length of array : " + marks.length);
        //========================= Linear-Search ========================
        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 16;

        //Function call - linear Search
        // int index = linearSearch(numbers, key);
        // if (index == -1) {
        //     System.out.println("Not found");
        // } else {
        //     System.out.println("Key at index : " + index);
        // }
        // String fruits[] = {"Apple", "Banana", "Chiku", "Mango", "Orange", "Papaya"};
        // String value = "Mango";
        // linearSearch(fruits, value);

        //----------------------- Practice Problem -------------------------
        //Largest Number - Find the largest number in the given array
        int nums [] = {1, 2, 6, 3, 5};
        largestNumber(nums);
    }
}
 */


//Binary Search
public class _07_Arrays {

    public static int binarySearch(int[] nums, int key) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if(nums[mid] == key) {
                return mid;
            } else if(nums[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int[] reverseArray(int arr[]) {
        int temp;
        int start = 0, last = arr.length-1;
        while(start < last) {
            temp = arr[last];
            arr[last] = arr[start];
            arr[start] = temp;

            start++;
            last--;
        }
        return arr;
    }

    public static void pairInArray(int nums[]) {
        for(int i = 0; i < nums.length-1; i++) {
            for(int j = i+1; j < nums.length-1; j++) {
                System.out.print("(" + nums[i] + ", " + nums[j] + ")");
            }    
            System.out.println("");
        }    
    }

    public static void printSubArrays (int nums[]) {
        for(int i = 0; i < nums.length; i++) {
            int start = i;
            for(int j = i; j < nums.length; j++) {
                int end = j;
                for(int k = start; k <= end; k++) {
                    System.out.print(nums[k] + " ");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }

    public static void maxSubArraysSum (int nums[]) {
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            int start = i;
            for(int j = i; j < nums.length; j++) {
                int end = j;
                int currSum = 0;
                for(int k = start; k <= end; k++) {
                    currSum += nums[k];
                }
                System.out.println(currSum);
                if(currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max Sum = " + maxSum);
    }

    //Prefix sum
    public static void prefixSum(int nums[]) {
        int currSum;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];

        //calculate prefix sum
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] +  nums[i];
        }

        for(int i = 0; i < nums.length; i++) {
            int start = i;
            for(int j = i; j < nums.length; j++) {
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum Sum : " + maxSum);
    }

    public static void kadanes(int nums[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum = currSum + nums[i];
            if(currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println("Max Subarray Sum is = " + maxSum);
    }

    public static void main(String args[]) {
        int[] nums = {2, 4, 6, 8, 10, 12, 14};
        //int key = 12;

        //function call - Binary Search
        //System.out.println("Key found at index : " + binarySearch(nums, key));

        //function call - reversed array
        //System.out.println("Reversed array : " + Arrays.toString(reverseArray(nums)));

        //Pairs in an array
        //pairInArray(nums);

        //Print Subarrays
        //printSubArrays(nums);

        //Max SubArray Sum
        // maxSubArraysSum(nums);

        //Max Subarray sum
        //Prifix Sum
        //prefixSum(nums);

        kadanes(nums);
        
    }
}

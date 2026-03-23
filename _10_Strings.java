
import java.util.*;

public class _10_Strings {

    public static void allCharacters(String full_name) {
        for (int i = 0; i < full_name.length(); i++) {
            System.out.print(full_name.charAt(i) + " ");
        }
        System.out.println();
    }

    //---------------Check Palindrome Function -----------------
    public static boolean isPalindrome(String palindromeStr) {
        for (int i = 0; i < palindromeStr.length() / 2; i++) {
            int n = palindromeStr.length();
            if (palindromeStr.charAt(i) != palindromeStr.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    //shortest path function
    public static void shortestPath(String str1) {
        int x = 0, y = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == 'W') {
                x--;
            }
            if (str1.charAt(i) == 'E') {
                x++;
            }
            if (str1.charAt(i) == 'N') {
                y++;
            }
            if (str1.charAt(i) == 'S') {
                y--;
            }
        }
        System.out.println("Shortest Path: " + Math.sqrt((x*x) + (y*y)));
    }

    //SubString Function
    public static String subString(String str3, int si, int ei) {
        String sub = "";
        for(int i = si; i < ei; i++) {
            sub += str3.charAt(i);
        }
        return sub;
    }
    
    //largest String in lexicographic order
    public static void largestString(String[] fruits) {
        String largest = fruits[0];
        for(int i = 1; i < fruits.length; i++) {
            if(largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }

    public static String ToUppercase(String str4) {
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str4.charAt(0));
        sb.append(ch);

        for(int i = 1; i < str4.length(); i++) {
            if(str4.charAt(i) == ' ' && i < str4.length()-1) {
                sb.append(str4.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str4.charAt(i)));
            } else {
                sb.append(str4.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        char arr[] = {'a', 'b', 'c', 'd'};
        String str = "abcd";
        String str2 = new String("abcdefgh");

        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter your name: ");
        // String name = sc.next(); // Single word - Input

        // System.out.print("Enter your full name: ");
        // String full_name = sc.nextLine(); // complete line - Input
        // System.out.println("Your name: " + name);
        // System.out.println("Your full name: " + full_name);
        //Length() Function in a String
        // System.out.println("Length of a String: " + full_name.length()); 
        //.CharAt function in a String
        // allCharacters(full_name);
        //---------------questions--------------
        //Check if a String is a palindrome
        String palindromeStr = new String("madams");
        //System.out.println(isPalindrome(palindromeStr));

        //Find the shortest path to reach the destination
        String str1 = "WNEENESENNN";
        //shortestPath(str1);

        String str3 = "HelloWorld";
        int si = 0, ei = 6;
        //System.out.println(subString(str3, si, ei));

        //SubString Function
        //System.out.println(str3.substring(0, 6));

        String [] fruits = {"apple", "mango", "banana"};
        // largestString(fruits); //In lexicographic

        //StringBuilder
        // StringBuilder sb = new StringBuilder("");
        // for(char ch = 'a'; ch <= 'z'; ch++) {
        //     sb.append(ch);
        // }
        // System.out.println(sb);

        //-------Question------
        // For each String, convert the first letter of each word to uppercase
        String str4 = "hi, i am bhupesh sahu!";
        System.out.println(ToUppercase(str4));
    }
}

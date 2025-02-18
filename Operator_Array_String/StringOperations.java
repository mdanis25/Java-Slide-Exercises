package Operator_Array_String;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the string 1: "); 
        String str1 = sc.nextLine();

        System.out.println("Enter the string 2: ");
        String str2 = sc.nextLine(); 

        // Length of the two strings 
        System.out.println("Length of str1: " + str1.length() + "\nLength of str2: " + str2.length());                                                                            
        System.err.println("str1 after replace: " + str1.replace(" ", "_"));

        if(str1.length() >= 1 ) {
            System.out.println("First character of str1: " + str1.charAt(0));
        } else {
            System.out.println("String is empty");
        }


        // Another way 
        if(str1.isEmpty()) {
            System.out.println("String is empty");
        } else {
            System.out.println("First character of str1: " + str1.charAt(0));
        }


        if(str1.equals(str2)) {
            System.out.println("Both strings are equal");
        } else {
            System.out.println("Both strings are not equal");
        }


        int indexOfA = str1.indexOf('a'); 
        if(indexOfA == -1) {
            System.out.println("Character 'a' is not present in str1");
        } else {
            System.out.println("Index of 'a' in str1: " + indexOfA);
        }


        if (str2.contains(str1)) {
            System.out.println("Str1 is a substring of Str2.");
        } else if (str1.contains(str2)) {
            System.out.println("Str2 is a substring of Str1.");
        } else {
            System.out.println("Neither string is a substring of the other.");
        }

        System.out.println("S1 in lowercase: " + str1.toLowerCase());
        System.out.println("S2 in uppercase: " + str2.toUpperCase());

        char[] charArray = str1.toCharArray();
        System.out.println("str1 as a character array:");
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }
        System.out.println(); 


        // Explanation of "trim" function
        System.out.println("\nTask of 'trim()': Removes leading and trailing spaces from a string.");
        String s1WithSpaces = "  hello world  ";
        System.out.println("Before trim: '" + s1WithSpaces + "'");
        System.out.println("After trim: '" + s1WithSpaces.trim() + "'");

        //  Difference between "equals()" and "=="
        System.out.println("\nDifference between 'equals()' and '==':");
        String s1 = new String("hello");
        String s2 = new String("hello");

        System.out.println("Using equals(): " + s1.equals(s2)); // true, compares content
        System.out.println("Using ==: " + (s1 == s2)); // false, compares memory location

        sc.close();
    }
    
}

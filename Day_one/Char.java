//Q1 Write a program to get a character as input and print its Unicode value. When a character is entered, the character itself is not stored. Instead, a numeric value(Unicode value) is stored.


// Sample Input :

// g

// Sample Output:

// 103

// Input (stdin)

// G

// Output (stdout)

// 71

import java.util.Scanner;
public class Char {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //Char to int
        char a=sc.next().charAt(0);
        int b= (int)a;
        System.out.println(b);
    }
}
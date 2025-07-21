//Q4.Write a java program to get 2 numbers from the user and
//swap their values without any loss of data.
//
//You can make use of additional variable for swapping.
//Print the corresponding swapped values of the two numbers as output in the console.
//
//Input format:
//First input: an integer
//Second input: an integer
//
//Output format:
//The output will be integers(swapped values)
//
//Sample Input:
//        20
//        10
//
//Sample Output:
//        10
//        20
//
//Input (stdin)
//5
//        10
//
//Output (stdout)
//10
//        5
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;
        c = b;
        b = a;
        a = c;
        System.out.printf("%d %d", a, b);
    }
}
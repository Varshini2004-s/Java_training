//Q2 a program to get a number(Unicode values) as input and print its equivalent character. You can display a character if you know ASCII code of that character.
//
//
//Sample Input:
//
//        103
//
//Sample Output:
//
//g
//Input (stdin)
//71
//
//Output (stdout)
//G
import java.util.Scanner;
public class Int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int to char

        int p = sc.nextInt();
        char q = (char) p;
        System.out.println(q);
    }
}


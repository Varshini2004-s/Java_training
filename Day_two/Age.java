//Q6. Ask a user for their birth year encoded as two digits (like "62") and for the current year, also encoded as two digits (like "99"). Write a program to find the users current age in years.
//
//Input format:
//Input consists of 2 integers
//he first integer corresponds to the last 2 digits of the birth year
//The second integer corresponds to the last 2 digits of the current year
//
//Output format:
//Print the user's current age
//Refer below sample output for formatting.
//
//Sample Input:
//        62
//        00
//
//Sample Output:
//        38
//
//Input (stdin)
//30
//        23
//
//Output (stdout)
//93
//
//Input (stdin)
//50
//        20
//
//Output (stdout)
//70
import java.util.*;
public class Age {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int birth=sc.nextInt();
        int current=sc.nextInt();
        if(current>birth){
            System.out.println(birth-current);
        }else{
            System.out.println((100-birth)+current);
        }
    }
}

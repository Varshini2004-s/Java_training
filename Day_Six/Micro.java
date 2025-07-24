/*
Q7
A microwave oven manufacturer recommends that when heating two items, add 50% to the heating time, and when heating three items double the heating time. Heating more than three items at once is not recommended. Write a program to find out the recommended heating time.

Input format:
The first input containing an integer which denotes the number of items
The second input containing the floating point number which denotes the single item heating time.

Output format:
Print the recommended heating time in floating point with 2 decimal places.
If the number of items is more than three, print "Number of items is more"

Sample Input:
2
5.0

Sample Output:
7.50

Input (stdin)
3
7.0

Output (stdout)
14.00
 */


import java.util.*;
public class Micro {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        float t=sc.nextFloat();
        if(n<=3){
            if(n==2){
                float a=t+t/2;
                System.out.printf("%.2f ",a);
            }else if(n==3){
                float a=t*2;
                System.out.printf("%.2f ",a);
            }else{
                System.out.println("Enter more than one item");
            }
        }
        else{
            System.out.println("Number of items is more");
        }
    }
}

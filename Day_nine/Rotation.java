/*
Write a program to Rotate the string in the specified direction and print the output.

Input Format:
First line contains the String A.
Second line contains the number of positions you have to shift the elements in the string.
Third line contains the direction either 'L' or 'R'.

Output Format:
Print the rotated string

Constraint:
1<=len(A)<1000

Sample input 1:
Rise
2
L
Sample Output 1:
seRi

Sample input 2:
Rider
2
R
Sample Output 2:
erRid
 */
import java.util.Scanner;
import java.util.Arrays;
public class Rotation {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String r=sc.nextLine();
        int n=sc.nextInt();
        char d=sc.next().charAt(0);
        int l=r.length();
        n=n%l;
        if(d=='L'){
            for(int i=n;i<l;i++){
                System.out.print(r.charAt(i));
            }
            for(int i=0;i<n;i++){
                System.out.print(r.charAt(i));
            }
        }
        else if(d=='R'){
            for(int i=l-n;i<l;i++){
                System.out.print(r.charAt(i));
            }
            for(int i=0;i<l-n;i++){
                System.out.print(r.charAt(i));
            }
        }
    }



























}

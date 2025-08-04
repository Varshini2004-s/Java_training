/*
Q1
Write a program to find the number of distinct elements in an unsorted array. [Do it without sorting the array]


Input Input:

Input consists of n+1 integers.

The first integer corresponds to n, the number of elements in the array.

The next n integers correspond to the elements in the array.

Assume that the maximum value of n is 15.



Output Format:

Output consists of a single integer which corresponds to the number of distinct elements in the array.



Sample Input:

5

3

2

3

780

90



Sample Output:

4



Input (stdin)

5
3
2
3
780
9


Output (stdout)
4
 */

import java.util.Scanner;
import java.util.Arrays;
public class Distinct {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []a =new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int d=0;

        for(int i=0;i<n;i++){

            boolean b=false;
            for(int j=0;j<i;j++) {
                if (a[i] == a[j]) {
                    b = true;
                    break;
                }
            }
                if(!b){
                    d++;
                }


        }
        System.out.print(d);
    }
}

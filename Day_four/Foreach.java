/* Q6
Virus Growth Prediction
In a country, a new virus has been discovered, and its growth pattern is of utmost importance to health experts and government agencies. The virus initially starts with a value of 0.5, and each day, it multiplies by 3. Researchers have been tasked with predicting the virus's growth over a certain number of days to understand its spread and take necessary preventive measures. The growth follows a predictable mathematical series where the virus’s value triples each day.

Your task is to help health professionals generate the virus growth prediction for a given number of days.

Given an integer n, your task is to generate the first n terms of the series that describes the virus's growth. The first term starts at 0.5, and each subsequent term is three times the previous term.

Write a program that will take n as input and print the first n terms of the series in the format specified below.



Input Format

The input consists of a single integer n which denotes the number of terms to be printed in the series.


Constraints

n will be a positive integer.


Output Format

The output should be the series of the first n terms, printed as space-separated floating-point numbers, formatted to one decimal place.


Example 1

Sample Input 1

5



Sample Output 1

0.5 1.5 4.5 13.5 40.5



Explanation

For the first sample input n = 5, the series is generated by multiplying each term by 3 starting from 0.5.

0.5 × 3 = 1.5

1.5 × 3 = 4.5

4.5 × 3 = 13.5

13.5 × 3 = 40.5

Therefore, the output is 0.5 1.5 4.5 13.5 40.5.



Example 2

Sample Input 2

1



Sample Output 2

0.5



Explanation

For the second sample input n = 1, the series only contains the first term, which is 0.5.
*/
import java.util.*;
public class Foreach {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        /* String a=sc.nextLine();
        char[] b=a.toCharArray();
        for(char i:b){
            System.out.print(i+",");
        }

         */
         int n=sc.nextInt();
         float b=0.5f;
         for(int i=1;i<=n;i++){
             System.out.printf("%.1f ",b);
             b=b*3;


         }

    }
}

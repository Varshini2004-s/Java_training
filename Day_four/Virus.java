/* Q8
Virus Growth Rate Prediction Based on Daily Increases

In a research lab, a group of scientists is studying the growth rate of a new virus that is spreading across the population. The scientists are tracking the virus's growth over several days, and the virus's growth rate changes every day in a predictable pattern. The growth rate on the first day increases by 13, on the second day it increases by twice 13, on the third day it increases by three times 13, and so on. They need to predict the virus growth for the next 'n' days.

Your task is to write a program to predict the growth rate for the virus over the first 'n' days, where each day's growth follows the pattern described above.

You are given a number 'n' which represents the number of days (or terms in the series). You need to generate the growth rate for the virus for the first 'n' days. The growth rate starts with a value of 2 on the first day, and the increase on each subsequent day is based on the multiples of 13 as described.



Input Format

The input consists of a single integer 'n', which denotes the number of terms (or days) to be printed in the series.


Constraints

'n' is a positive integer (NA for any additional constraints).


Output Format

Print the series of virus growth rates for 'n' days, separated by spaces.


Example 1

Sample Input 1

5



Sample Output 1

2 15 41 80 132



Explanation

For n = 5, the series starts at 2 and increases in the following pattern:

1st term: 2 (Start)

2nd term: 2 + 13 = 15

3rd term: 15 + (2 * 13) = 41

4th term: 41 + (3 * 13) = 80

5th term: 80 + (4 * 13) = 132

Thus, the output is 2 ,15 ,41, 80 ,132.



Example 2

Sample Input 2

6



Sample Output 2

2 15 41 80 132 197



Explanation

For n = 6, the calculation continues:

6th term: 132 + (5 * 13) = 197
Thus, the output is 2 ,15 ,41, 80 ,132 ,197.
*/
import java.util.*;
public class Virus {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=2;
        for(int i=1;i<=n;i++){
            System.out.println(sum);
            int a=i*13;
            sum=sum+a;
        }
    }
}

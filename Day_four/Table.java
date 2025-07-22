/*print the tables for the given number till the specified iteration
Sample input:
5
Output:
5*1=5
5*2=10
5*3=15
5*4=20
5*5=25
 */

import java.util.*;
public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //logic 1
        /*
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(n + "X" + i + "=" + n*i);
            }
        }

         */
      //logic 2
      for(int i=2;i<=10;i+=2){
          System.out.println(n + "X" + i + "=" + n*i);

      }
    }
}
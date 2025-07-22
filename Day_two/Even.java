
//Q5. Write a java program to print the given number is even or odd without using % Operator
import java.util.*;
public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //logic 1
        int n = sc.nextInt();
      /*  if(n==(n/2)*2){
//logic 2
//if((n&1)==0){
//logic 3
//if((n-(n/2)*2)==0){
//logic 4
        //if (((n >> 1) << 1) == n) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
*/

        //logic 5
    while(n>=2){
        n=n-2;
    }
    if(n==0){
        System.out.println("Even");
    }else{
        System.out.println("Odd");
    }

    }
}



/* Q1
Write a java program to find count of a digits without converting into string as well as length method.
 */
import java.util.*;
public class Digit {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int count=0;
        //logic 1
        /*
        while(n!=0){
            n/=10;
            count++;

        }
        System.out.println(count);

         */
        //logic 1
        /*
        do{
            n=n/10;
            count++;
        }while(n!=0);
        System.out.println(count);

         */
        //logic 3
        n=Math.abs(n);
        if(n==0){
            count=1;
        }else{
            while(n!=0){
                n/=10;
                count++;
            }
        }System.out.println(count);
    }
}

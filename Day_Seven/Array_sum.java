//Write a java program to print the sum of the elements in the array
import java.util.*;
public class Array_sum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();

        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+a[i];
        }
        System.out.print(sum);
    }
}

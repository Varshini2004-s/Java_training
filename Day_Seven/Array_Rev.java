/*Write a java program to print the array elements in the reverse order
Sample input:
5
1
2
3
4
5
Sample Output:
5 3 1
 */



import java.util.*;
public class Array_Rev {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();

        }for(int i=n-1;i>=0;i-=2){
            System.out.print(a[i]+ " ");
        }

    }
}

//Write a java program to create an array of elements.
import java.util.Scanner;
public class Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.printf("%d ",a[i]);
           // System.out.println(a[i]);
           // System.out.print(a[i]+" ");


        }

    }
}

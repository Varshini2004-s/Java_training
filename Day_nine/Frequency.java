//Write a java program to find the frequency of the given numbers

import java.util.Scanner;
import java.util.Arrays;

public class Frequency {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] f=new int[n];
        int v=-1;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++) {
            int c = 1;
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                    c++;
                    f[j] = v;
                }
            }
            if (f[i] != v) {
                f[i] = c;
            }
        }
            System.out.println("Element : Frequency");
            for(int i=0;i<n;i++){
                if(f[i]!=v){
                    System.out.println(a[i]+" Count" + f[i]);
                }
            }


    }
}

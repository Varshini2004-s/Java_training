/*
Q1
//Print the following pattern
A B C D
E F G H
I J K L
*/



import java.util.*;
public class Alpha {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //logic 1
        char ch='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(ch++ +" ");

            }
            System.out.println();
        }


        //logic 2
/*        int ch=65;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print((char)ch+" ");
                ch++;
            }
            System.out.println();
        }
        */

    }
}


//Write a java program to print the maximum element in the array
import java.util.*;
public class Array_max {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //Without sorting
        /*
        //method 1
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.printf("%d ",max);

        //method 2
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        System.out.print(max);
        */
        //With sorting
         Arrays.sort(arr);
         System.out.printf("Max: %d",arr[n-1]);
    }

}

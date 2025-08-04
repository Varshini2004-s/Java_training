/*
Arun's teacher gave him the following challenge. Help him solve it. "Given an array with 'n' elements by a user, you need to search if a particular element is present in the array or not. The element to be searched for is also given by the user"


Input Format:

Input consists of n+2 integers.

The first integer corresponds to ‘n’, the size of the array.

The next ‘n’ integers correspond to the elements in the array.

The last integer corresponds to ‘a’, the element to be searched.



Output Format:

Refer to sample output for details.



Sample Input:

5

2

3

6

8

1

6



Sample Output:

6 is present in the array



Input (stdin)

5
2
3
6
8
1
9


Output (stdout)

9 is not present in the array
 */
import java.util.Scanner;
import java.util.Arrays;
public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int s = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (s == a[i]) {
                flag = true;
                break;
            }
        }
        if(flag==true){
            System.out.println(s+" is present in the array");
    }else{
            System.out.println(s+" is not present in the array");
        }











    }
}

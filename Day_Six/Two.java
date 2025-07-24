/* Q6

In an emergency situation, it is crucial to display safety instructions in a clear and attention-grabbing way. A security system at a busy train station is designed to flash emergency instructions on a large screen in the shape of an "X" pattern using a given instruction string. This unique design ensures visibility from different angles and grabs the attention of people in the area.
Your task is to write a program that takes an instruction string as input and generates an "X" pattern using characters from the string. The size of the pattern will be determined by the length of the string.

Input Format
A string s representing the emergency instruction message. Note: The length of the string n must be an odd integer greater than or equal to 3.

Constraints
NA

Output Format
An "X" pattern printed on a grid of size n x n, where n is the length of the string s.

Sample Input 0
EMERGENCY

Sample Output 0

E       Y
 M     C
  E   N
   R E
    G
   R E
  E   N
 M     C
E       Y

Sample Input 1
ATTENTION

Sample Output 1

A       N
 T     O
  T   I
   E T
    N
   E T
  T   I
 T     O
A       N

 */



import java.util.*;
public class Two {
    public static void main(String []  args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        if(n>3 && n%2!=0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j) {
                        System.out.print(s.charAt(i));
                    } else if (i + j == n - 1) {
                        System.out.print(s.charAt(i));
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }else{
            System.out.println("Enter a string whose length must be an odd integer greater than or equal to 3");
        }
    }
}

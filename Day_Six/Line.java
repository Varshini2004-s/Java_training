/* Q3
//Print the following pattern
  A E I M
  B F J N
  C G K O
  D H L P
 */

import java.util.*;

public class Line {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char ch='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print((char)('A'+(n*j)+i) +" ");
            }
            System.out.println();

        }
    }
}

/*Q2
//Print the following pattern
    P O N M
    L K J I
    H G F E
    D C B A
*/

import java.util.*;
public class RevAlp
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char ch='P';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(ch-- +" ");
            }
            System.out.println();
        }
    }
}

//Q1.Write a java program to print Range of Even Numbers Without using Modulas operator
//input :9
//output: 2 4 6 8


import java.util.*;
    public class Range{
        public static void main(String[] args) {
            Scanner obj=new Scanner(System.in);
            int n=obj.nextInt();
            for(int i=0;i<=n;i++){
                //if(i==((i/2)*2)){
                //if(i-((i/2)*2)==0){
                //if((i&1)==0){
                //if((i>>1<<1)==i){
                int i1=i;
                while(i1>=2) {
                    i1 = i1 - 2;
                    if (i1 == 0) {
                        System.out.print(i + " ");
                    }
                }
            }
        }
    }

package Basic_Java.Loops;

import java.util.Scanner;

public class While_Loop {
    public static void main(String[] args) {

//        print the number 1 2 3 4 5 by spaces taking input by user
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        int i=1;
//        while(i<=n){
//            System.out.print(i+" ");
//            i++;
//
//        }

        //-------------------------------

        int i=n;
        while(i>=1){
            System.out.print(i+" ");
            i--;
        }
    }
}

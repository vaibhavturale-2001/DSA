package Basic_Java.Proble_Solving;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
//
//        if((a<=10 && b>=10) || (a%2==0 || b%2==0) || (a!=b) ){
//            System.out.println("true"+" "+"true"+" "+"true");
//        }else {
//            System.out.println("false");
//        }

        //-----------OR------------//

        boolean condition1=(a<=10 && b>=10);
        boolean condition2=(a%2==0 || b%2==0);
        boolean condition3=(a!=b);
        System.out.println(condition1+" "+condition2+" "+condition3);
    }
}

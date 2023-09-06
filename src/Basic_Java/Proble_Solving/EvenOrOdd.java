package Basic_Java.Proble_Solving;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        int n=3;
        if(n%2==0){
            System.out.println("It is Even Number");
        }else {
            System.out.println("It is Odd Number");
        }
    }
}

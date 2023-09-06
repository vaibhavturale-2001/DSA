package Basic_Java.Loops;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int i=a;
        while(i <= b){
            System.out.println(i);
            i++;
        }
    }
}

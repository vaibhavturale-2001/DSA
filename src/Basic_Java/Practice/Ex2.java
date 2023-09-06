package Basic_Java.Practice;

import java.util.Scanner;

public class Ex2 {

    static void printAsc(int n){
        for (int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=n;i++){
            printAsc(i);
            System.out.println();
        }
        for (int i=n-1;i>0;i--){
            printAsc(i);
            System.out.println();
        }


    }
}

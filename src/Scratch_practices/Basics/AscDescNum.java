package Scratch_practices.Basics;

import java.util.Scanner;

public class AscDescNum {
    static void asc(int n1){
        for (int i=1;i<=n1;i++){
            System.out.print(i+" ");
        }
    }

    static void desc(int n2){
        for (int i=n2;i>=1;i--){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        asc(n1);
        desc(n2);
    }
}

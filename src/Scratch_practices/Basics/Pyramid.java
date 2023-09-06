package Scratch_practices.Basics;

import java.util.Scanner;

public class Pyramid {
    static void printPyramid(int n){
        for (int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for (int i=0;i<n;i++){
            printPyramid(i);
            System.out.println();
        }
    }
}

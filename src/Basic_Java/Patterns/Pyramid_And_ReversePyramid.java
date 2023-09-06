package Basic_Java.Patterns;

import java.util.Scanner;

public class Pyramid_And_ReversePyramid {

    static void printAsc(int n){
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
    }
//    static void printDesc(int n){
//        for(int i=1;i<=n;i++){
//            System.out.print(i+" ");
//        }
//    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        printAsc(n);
//        printDesc(n-1);
        for(int i=1;i<=n;i++){
            printAsc(i);
            System.out.println();
        }
        for (int j=n-1;j>=1;j--){
            printAsc(j);
            System.out.println();
        }
    }
}

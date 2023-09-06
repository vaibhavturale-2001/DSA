package Basic_Java.Patterns;

import java.util.Scanner;

public class AscDecPattern {
    static void asc(int n){

        for (int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
    }
    static void desc(int n1){

        for (int i=n1;i>=1;i--){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n1=sc.nextInt();
        asc(n);
        desc(n1);
    }
}

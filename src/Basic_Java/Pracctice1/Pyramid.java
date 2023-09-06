package Basic_Java.Pracctice1;

import java.util.Scanner;

public class Pyramid {
    static void print_Pyramid(int n){
        for (int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=0;i<=n;i++){
            print_Pyramid(i);
            System.out.println();
        }
        for (int i=n;i>0;i--){
            print_Pyramid(i-1);
            System.out.println();
        }

    }
}

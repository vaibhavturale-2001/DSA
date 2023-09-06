package DSA.Two_D_Array;

import java.util.Scanner;

public class declare_Input_Print {
    /*
    *write a program to take a 2d array with n rows and
    n columns as a input.
    *
    * Input Example:
    * n=3, m=4
    * 1 2 3 4
    * 5 6 7 8
    * 9 5 3 1
    *
    * */

    static void printArray(int[][] arr,int n,int m){
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter demession of an array:");
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        System.out.println("Enter array indexes:");
        for (int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        printArray(arr, n, m);
    }
}

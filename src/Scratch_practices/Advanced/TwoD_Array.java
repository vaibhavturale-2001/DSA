package Scratch_practices.Advanced;

import java.util.Scanner;

public class TwoD_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        int determinant=arr[0][0]*arr[1][1]-arr[0][1]*arr[1][0];
        System.out.println(determinant);
    }
}

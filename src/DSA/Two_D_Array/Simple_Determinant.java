package DSA.Two_D_Array;

import java.util.Scanner;

public class Simple_Determinant {
    /*
    * n*m  matrix, how many elements
    * 2*2 matrix, how many elements=4
    *    |a  b|
    *    |c  d|
    *    determinat= a*b - c*d
    *
    * */

//    static void determinantOfArray(int[][] arr,int n,int m){
//        for (int i=0;i<n;i++){
//            for (int j=0;j<m;j++){
//                System.out.println();
//            }
//        }
//    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][] arr=new int[2][2];
        for (int i=0;i<2;i++){
            for (int j=0;j<2;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int determinant=arr[0][0]*arr[1][1] - arr[0][1]* arr[1][0];
        System.out.println(determinant);
    }
}

package Scratch_practices.Basics;

import java.util.Scanner;

public class Array {

    static void reverseArr(int[] arr) {
        for (int i= arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        for (int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//        }
        int[] arr=new int[]{1,2,3,4,5,6};
        for (int i= arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

    }
}

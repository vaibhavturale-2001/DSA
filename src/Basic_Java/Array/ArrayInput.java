package Basic_Java.Array;

import java.util.Scanner;

public class ArrayInput {
    static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];          //decide size of array using n
        for (int i=0;i<arr.length;i++){
            System.out.println("enter number upto size");
            arr[i]=sc.nextInt();
        }
        printArray(arr);
//        for (int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }

        System.out.println(arr.length);

    }
}

package Basic_Java.Array;

import java.util.Scanner;

public class SubArray {
    static void printSubArr(int[] arr,int startIndex,int endIndex){
        for (int i=startIndex;i<=endIndex;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7};
        int startIndex=2;
        int endIndex=6;
//        int n=sc.nextInt();
//        int startIndex=n;
//        int endIndex=n;
//        int[] arr=new int[n];
//        for (int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
        printSubArr(arr,startIndex,endIndex);

    }
}

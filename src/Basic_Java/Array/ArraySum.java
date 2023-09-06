package Basic_Java.Array;

import java.util.Scanner;

public class ArraySum {
    static int printArr(int[] arr){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }

    public static void main(String[] args){
        int[] arr={1,2,3,4,10};
        System.out.println(printArr(arr));
//        int sum=0;
//        for (int i=0;i<arr.length;i++){
//            sum=sum+arr[i];
//        }
//        System.out.println(sum);

    }
}

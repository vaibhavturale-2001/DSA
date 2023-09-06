package Basic_Java.Array;

import java.util.Scanner;

public class Ex_Max_Min_Array {
    static int getMinimumFromArray(int[] arr){
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            min=Math.min(min,arr[i]);
        }
        return min;
    }
    static int getMaximumFromArray(int[] arr){
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }

    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int[] arr=new int[n];
//        for (int i=0;i<arr.length;i++){
//            arr[i]=sc.nextInt();
//        }
        int[] arr=new int[]{1,2,3,4};
//                System.out.println(getMinimumFromArray(arr));
//                System.out.println(getMaximumFromArray(arr));
//                            OR
        int min=getMinimumFromArray(arr);
        int max=getMaximumFromArray(arr);
        System.out.println("minimum from array "+min);
        System.out.println("maximum from array "+max);
    }
}

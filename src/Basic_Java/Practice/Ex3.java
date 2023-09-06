package Basic_Java.Practice;

import java.util.Scanner;

public class Ex3 {

    static int printMaxNum(int[] arr){
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }



    public static void main(String[] args) {

        int[] arr = new int[]{2, 4, 6, 3};
        int max=printMaxNum(arr);
        System.out.println(max);


    }
}

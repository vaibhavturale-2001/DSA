package Basic_Java.Pracctice1;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Max_Min_Array {

    static int getMaxFromArray(int[] arr){
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }
    static int getMinFromArray(int[] arr){
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            min=Math.min(min,arr[i]);
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] arr={2,4,6,7,9,10,20};
       int Max=getMaxFromArray(arr);
        int Min=getMinFromArray(arr);
        System.out.println(Max);
        System.out.println(Min);


    }
}

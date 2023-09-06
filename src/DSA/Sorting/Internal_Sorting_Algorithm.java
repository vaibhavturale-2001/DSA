package DSA.Sorting;

import java.util.Arrays;

public class Internal_Sorting_Algorithm {

    static void printArray(int[] arr){
        for (int a:arr){
            System.out.print(a+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr=new int[]{9,4,5,1,6,9,12,23,41};

        Arrays.sort(arr);
        printArray(arr);

    }
}

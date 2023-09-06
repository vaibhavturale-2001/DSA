package Basic_Java.Array;

import java.util.Scanner;

public class Reverse_Array {

    static void reverseArray(int[] arr){
        int i=0;
        int j= arr.length-1;
        while ( i < j ){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.print(i+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
//        int[] arr={1,2,3,4,5,6};
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        reverseArray(arr);
    }
}

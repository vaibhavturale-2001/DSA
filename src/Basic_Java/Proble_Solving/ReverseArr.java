package Basic_Java.Proble_Solving;

import java.util.Scanner;

public class ReverseArr {
    /*
    * Reverse the array,first number becomes last and second number becomes 2nd from the 2nd last
    * print the sum of even indices and
    * print the product of odd indices
    *
    * Explanation:
    * int[] arr={1,2,3,4}
    *
    * reverse:-- {4,3,2,1}
    *
    * sum of even indices:- 6
    * product of odd indices :-  3
    *
    * */
    static void reverseArr(int[] arr){
        for (int i= arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        reverseArr(arr);
//        for (int i=;i>=0;i--){
//            System.out.print(arr[i]+" ");
//        }

    }
}

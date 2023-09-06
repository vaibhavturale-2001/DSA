package Basic_Java.Proble_Solving;

import java.util.Scanner;

public class Hp_Hip_Array {

    static void revArr(int[] arr){
        int i=0;
        int j= arr.length-1;
        while (i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=arr[temp];
            i++;
            j--;
            System.out.print(arr[i]+" ");

        }
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        revArr(arr);

//        int sum=0;
//        for (int i=1;i<arr.length;i=i+2){
//            sum=sum+arr[i];
//        }
//        int product=1;
//        for (int i=0;i<arr.length;i=i+2){
//            product=product*arr[i];
//        }
//
//        System.out.println("sum of odd elememt "+sum);
//        System.out.println("product of even elememt "+product);
    }
}

package Basic_Java.Practice;

import java.util.Scanner;

public class Ex1 {
    /*
    * Take input n
    * input: 4
    * 1 2 3 4
    *
    * output:
    * 1 2 3 4
    * 4
    *
    * */
    static void printInput(int[] arr){
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n size of an array");
        int n=sc.nextInt();
        System.out.println("Enter n=number number");
        int[] arr=new int[n];
//        System.out.println("length of an array ="+arr.length);
        for (int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
//        for (int i=0;i< arr.length;i++){              OR ==function
//            System.out.print(arr[i]+" ");             OR ==function
//        }
        printInput(arr);
        System.out.println();
        System.out.println(arr.length);



    }
}

package DSA.Problem_Solving;

import java.util.Scanner;

public class TargetDifference{

    static boolean doesTargetDiffExist(int arr[] ,int targetDiff){
        for (int i=1;i<arr.length;i++){
            int b=arr[i];
            int a=b-targetDiff;
            //check if a exixst in the array till b

            if (binarySearch(arr,0,i-1, a)!=-1){
                return true;
            }
        }
        return false;
    }

    static int binarySearch(int[] arr,
                            int low,
                            int high,
                            int element){
        while (low <= high){
            int mid=(low + high)/2;
            if (arr[mid]==element){
                return mid;
            } else if (arr[mid]>element) {
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        System.out.println("Enter elements");
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter Target");
        int targetDiff=sc.nextInt();
        if (doesTargetDiffExist(arr,targetDiff)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }

}

package DSA.Problem_Solving;

import java.util.Scanner;

public class Binary_Search {

    static int searchNum(int[] arr,int target){
        int low=0;
        int high=arr.length-1;

        while (low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return mid;
            }else if (arr[mid]<target){
                low=mid+1;
            }else {
                high=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  size of array");
        int target=sc.nextInt();
        int[] arr=new int[target];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int index=searchNum(arr,target);
        System.out.println(index);
    }
}

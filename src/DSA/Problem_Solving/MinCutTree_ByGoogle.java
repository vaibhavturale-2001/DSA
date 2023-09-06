package DSA.Problem_Solving;

import java.util.Scanner;

public class MinCutTree_ByGoogle{
    static int getMaxFromArray(int[] arr){
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }

    /*
    *  below function to tell us the amount of wood
    * which will be collected
    *
    * Input: int[]arr ,int x
    * Output: long (datatype)
    * */

    static long getCollectedWood(int[] arr,int x){
        long woodCollected=0;
        for (int i=0;i<arr.length;i++){
            woodCollected=woodCollected+Math.max(0,arr[i]-x);
        }
        return woodCollected;
    }

    static int binarySearch(int[] arr,int k){
        int low=1;
        int high=getMaxFromArray(arr);

        while (low <= high){
            int mid=(low + high)/2;
            long woodCollected=getCollectedWood(arr,mid);

            if (woodCollected <= k){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return low;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(binarySearch(arr,k));
    }
}

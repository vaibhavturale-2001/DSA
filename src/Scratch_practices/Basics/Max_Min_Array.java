package Scratch_practices.Basics;

public class Max_Min_Array {

    static int maxFromArray(int[] arr){
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        return max;
    }
    static int minFromArray(int[] arr){
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            min=Math.min(min,arr[i]);
        }
        return min;
    }
    public static void main(String[] args) {
       int[] arr=new int[]{1,2,3,4,5,6,6,7,8,9};
       int max=maxFromArray(arr);
       int min=minFromArray(arr);
        System.out.println(max);
        System.out.println(min);
    }
}

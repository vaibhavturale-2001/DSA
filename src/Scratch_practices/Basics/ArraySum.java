package Scratch_practices.Basics;

public class ArraySum {
    static int arrSum(int[] arr){
        int sum=1;
        for (int i=0;i<arr.length;i++){
            sum=sum*arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
//        int[] arr=new int[]{10,20,30,40};
        int[] arr=new int[]{1,2,3,4};
        System.out.println(arrSum(arr));
    }
}

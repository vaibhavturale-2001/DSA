package Basic_Java.Practice;

public class SumArray {
    /*
    * write a function which takes as integer array as input
    * you should return sum of element of array
    * example:
    * arr=[1,2,3,4]
    *
    * you should return 16
    *
    *
    *
    * */
    static int printSum(int[] arr){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,100+100};
        System.out.println( printSum(arr));

    }
}

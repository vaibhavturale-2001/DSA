package Basic_Java.Array;

public class SumOfSubArray {
    static int sumSubArr(int[] arr,int startIndex,int endIndex){
        int sum=0;
        for (int i=startIndex;i<=endIndex;i++){
            sum=sum+arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr={1,3,4,5,6,7};
        int startIndex=2;
        int endIndex=5;
        System.out.println(sumSubArr(arr,startIndex,endIndex));
    }
}

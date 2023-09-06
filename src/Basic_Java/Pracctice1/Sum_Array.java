package Basic_Java.Pracctice1;

public class Sum_Array {

    static int sum_Array(int[] arr){
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,4};
        System.out.println( sum_Array(arr));
    }
}

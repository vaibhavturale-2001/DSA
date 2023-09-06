package Basic_Java.Array;

public class ArrayProduct {

    static int ProductArr(int[] arr){
        int prod=1;
        for (int i=0;i<arr.length;i++){
            prod=prod*arr[i];
        }
        return prod;
    }
    public static void main(String[] args) {
        int[] arr1={1,4,5,6};
        System.out.println(ProductArr(arr1));

    }
}

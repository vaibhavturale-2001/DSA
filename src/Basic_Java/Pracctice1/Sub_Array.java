package Basic_Java.Pracctice1;

public class Sub_Array {

    static void getSubArray(int[] arr,int startIndex,int endIndex){
        for (int i=startIndex;i<=endIndex;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr={4,2,6,7,9,1};
        int startIndex=1;
        int endIndex=4;
        getSubArray(arr,startIndex,endIndex);

    }
}

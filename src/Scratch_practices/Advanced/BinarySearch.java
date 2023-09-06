package Scratch_practices.Advanced;

public class BinarySearch {

    static int binarySearch(int[] arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low <= high){
            int mid=(low+high)/2;
            if (arr[mid]==target){
                return mid;
            } else if (arr[mid]>target) {
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{10,20,22,24,27,29,30,33,38,40};
        int target=33;
        int index=binarySearch(arr,target);
        System.out.println(index);
    }
}

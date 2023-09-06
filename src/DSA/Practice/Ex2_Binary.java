package DSA.Practice;

public class Ex2_Binary {

    static int binarySearch(int[] arr, int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==target){
                return mid;
            } else if (arr[mid]<target) {
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={2,4,5,8,10,14,17,19,22,28};
        int target= 10;
        int index=binarySearch(arr,target);
        System.out.println(index);
    }
}

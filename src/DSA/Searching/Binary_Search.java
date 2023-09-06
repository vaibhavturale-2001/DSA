package DSA.Searching;

public class Binary_Search{

    static int binarrSearch(int[] arr,int element){
        int low=0;
        int high=arr.length-1;
        while (low <= high){
            int mid=(low+high)/2;
            if (arr[mid]==element){
                return mid;
            }else if(arr[mid]<element){
                // element will lie toward right
                low=mid+1;
            }else {
                high=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr={10,30,50,70,90,120,150,200};
        int element=30;
        int index=binarrSearch(arr,element);
        System.out.println(index);
    }
}

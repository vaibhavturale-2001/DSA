package DSA.Searching;

public class Linear_Search{

    static int linearSearch(int[] arr,int target){
        for (int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int[] arr=new int[]{2,4,6,11,20,3,8,9,21,25};
        int target=11;
        int index=linearSearch(arr,target);
        System.out.println(index);

    }
}

package Scratch_practices.Advanced;

public class LinearSearch {

    static int linearSearch(int[] arr,int target){
        for(int i=0;i< arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{10,20,40,30,50,70};
        int target=20;
        int index=linearSearch(arr,target);
        System.out.println(index);

    }
}

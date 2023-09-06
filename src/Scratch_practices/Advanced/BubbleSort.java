package Scratch_practices.Advanced;

public class BubbleSort {
    static void bubbleSort(int[] arr){
        for(int lastIndex=arr.length;lastIndex > 0;lastIndex--){
            int i=0;
            int j=i+1;
            while (j < lastIndex){
                if(arr[i] < arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                i++;
                j++;
            }
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr=new int[]{5,6,4,9,3,8,2,1};
        bubbleSort(arr);
    }
}

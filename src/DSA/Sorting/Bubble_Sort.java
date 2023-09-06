package DSA.Sorting;

public class Bubble_Sort {

    static void bubble_Sort(int[] arr){

        for (int lastIndex= arr.length;lastIndex > 0;lastIndex--){
            int i=0;
            int j=i+1;
            while (j < lastIndex){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                i++;
                j++;
            }
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={4,3,6,8,7,5};
        bubble_Sort(arr);
    }
}

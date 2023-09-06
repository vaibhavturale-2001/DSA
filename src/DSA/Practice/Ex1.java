package DSA.Practice;

public class Ex1 {

    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr=new int[]{2,8,3,9,4,1,5};
        int target=5;
        int index=linearSearch(arr,target);
        System.out.println(index);
    }
}

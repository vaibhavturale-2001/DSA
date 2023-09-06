package DSA.Sorting;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Internal_Sorting_Algorithm_Descending {
    public static void main(String[] args) {
        Integer[] arr=new Integer[]{8,5,3,6,12,11,15,10};
        Arrays.sort(arr ,Collections.reverseOrder());
        for (int a:arr){
            System.out.print(a+" ");
        }
    }
}

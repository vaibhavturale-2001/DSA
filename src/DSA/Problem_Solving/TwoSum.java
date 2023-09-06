package DSA.Problem_Solving;

public class TwoSum {
    /*
    * Input: int[]arr ,int target
    * Output: [num1,num2]    ,addition of target: return [num1,num2]
    *
    * */
    static int twoSum(int[] arr,int target){
        for (int i=0;i<arr.length;i++){
            if (arr[i] == target ){
                return i;
            }
        }
        return -1;
    }
}

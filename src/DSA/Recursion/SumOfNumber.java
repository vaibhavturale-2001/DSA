package DSA.Recursion;

public class SumOfNumber {
    /**
     * Write a function to compute the sum of number
     *Input:- int n
     * Output=1+2+3+4+.....+n
     */

    static int recursiveSum(int n){
        if(n==0){
            return 0;
        }else {
           return n + recursiveSum(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(recursiveSum(5));
    }
}

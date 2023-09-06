package DSA.Problem_Solving;

public class Ex1 {
    public static boolean isPerfectSquare(int num) {
        /*
        Input: int num
        Output: true or flase
        */
        int low=1;
        int high=100000;
        while(low <= high){
            int mid=(low+high)/2;
            int square=mid*mid;
            if (square==num){
                return true;
            } else if (square < num ) {
                low=mid+1;
            }else {
                high=mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(25));
    }
}

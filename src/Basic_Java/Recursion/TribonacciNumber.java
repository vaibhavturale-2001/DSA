package Basic_Java.Recursion;

public class TribonacciNumber {
    /**
     *  f(n)=f(n-1) + f(n-2) + f(n-3)
     *
     *  f(1)=0
     *  f(2)=0
     *  f(3)=1
     *
     *  if n = 4
     *  f(4) = f(3) + f(2) + f(1) =1
     *  f(5) =  f(4) + f(3) + f(2) = 1 + 1 + 0 = 2
     *
     *
     */
    static int tribonacciNum(int n){
        if(n==1 || n==2){
            return 0;
        }else if(n==3){
            return 1;
        }else {
            return tribonacciNum(n-1)
                    +tribonacciNum(n-2)
                    +tribonacciNum(n-3);
        }
    }
}

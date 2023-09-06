package DSA.Recursion;

public class Factorial {
    /*
    * Write a recursive program of factorial of n
    * factorial of number written as:
    * f(n)=n*(n-1) * (n-2) * (n-3) *.....*1
    *
    *
    * */

    static int factorialOfNum(int n){
        if(n==1){
            return 1;
        }
        return n * factorialOfNum(n-1);
    }

    public static void main(String[] args) {
        int n=5;
        System.out.println(factorialOfNum(n));
    }
}

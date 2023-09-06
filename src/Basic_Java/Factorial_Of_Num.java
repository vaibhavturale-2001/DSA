package Basic_Java;

public class Factorial_Of_Num {

    static int factorialNumber(int n){
        int f=1;
        for (int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }

    public static void main(String[] args){
        int n=10;
        System.out.println(factorialNumber(n));
    }
}

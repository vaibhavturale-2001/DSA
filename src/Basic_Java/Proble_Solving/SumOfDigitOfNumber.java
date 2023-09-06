package Basic_Java.Proble_Solving;

public class SumOfDigitOfNumber {

    static int sum1(int n){          // n=1007
        int sum=0;                  // sum= 0
        while(n != 0){
            int last_digit=n%10;     //  1007 % 10=7  i.e last_digit =7
            n=n/10;                  //  1007 / 10= 100
            sum=sum+last_digit;      //  0 + 7= 7
        }
        return sum;                 //sum = 7
    }

    public static void main(String[] args) {
        System.out.println(sum1(1234));
    }
}

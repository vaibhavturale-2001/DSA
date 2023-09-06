package Basic_Java.Pracctice1;

public class Sum_Of_digits {
    public static int sum(int n){
        int sum=0;
        while (n!=0){
            int last_digit=n%10;
            n=n/10;
            sum=sum+last_digit;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(2222));
    }
}

package Basic_Java.String_NS;

public class Rev_Num {

    static int revNum(int num){
        int rev_Num=0;

        while( num > 0){
            int digit= num%10;
            rev_Num=rev_Num * 10+ digit;
            num=num/10;
        }
        return rev_Num;
    }

    public static void main(String[] args) {
        int num=12345;
        int revNum=revNum(num);
        System.out.println(revNum);
    }
}

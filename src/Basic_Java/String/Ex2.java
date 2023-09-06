package Basic_Java.String;

public class Ex2 {
    public static void main(String[] args) {
        int num=121;
        int temp;
        temp=num;
        int revNum=0;
        while (num>0){
            int digit=num % 10;
            revNum=revNum * 10 +digit;
            num=num/10;
        }
        if (temp == revNum){
            System.out.println(revNum +"-->The number is a Palindrome");
        }else{
            System.out.println(revNum +"-->The number is a not palindrome");
        }

    }
}

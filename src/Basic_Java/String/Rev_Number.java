package Basic_Java.String;

public class Rev_Number {
    public static void main(String[] args){
        int num=123456;
        int num1=0;
        while(num>0){
            int digit=num%10;
            num1=num1*10+digit;
            num=num/10;
        }
        System.out.println(num1);
    }
}

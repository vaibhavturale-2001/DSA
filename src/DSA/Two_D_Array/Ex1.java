package DSA.Two_D_Array;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String newStr="";
        String n;
        char ch;
        for (int i=0;i<str.length();i++){
            ch=str.charAt(i);
            newStr=ch+newStr;
        }
        if(str.equals(newStr)){
            System.out.println(newStr +"--> This String is palindrome");
        }else {
            System.out.println(newStr +"--> This String is not palindrome");
        }
    }
}

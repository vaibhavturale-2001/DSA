package Basic_Java.String;

import java.util.Scanner;

public class Palindrome {
    public static void reverseString(String org_str){
        String str="";
        char ch;
//        for (int i=org_str.length()-1;i>=0;i--){
        for (int i=0;i<org_str.length();i++){
            ch=org_str.charAt(i);
            str=ch+str;
        }
        System.out.println(str);

        if (str.equals(org_str)){
            System.out.println("String is Palindrome");
        }else {
            System.out.println("String is not Palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String org_str=sc.nextLine();
        reverseString(org_str);

    }
}

package Basic_Java.String_NS;

import java.util.Scanner;

public class Check_Palindrome {
    /*
    * Given a string s, check if it a palindrome
    * s="madam"
    *
    * */
    static  void checkPalindrome(String s){
        String revStr="";

        for (int i=s.length()-1; i >= 0; i--){
            revStr = revStr + s.charAt(i);
        }
        System.out.println(revStr);

        if (s.equals(revStr)) {
            System.out.println("Given String is Palindrome");
        }else{
            System.out.println("Given String is Not Palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        checkPalindrome(s);
    }
}

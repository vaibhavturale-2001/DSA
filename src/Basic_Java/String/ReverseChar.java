package Basic_Java.String;

import java.util.Scanner;

public class ReverseChar {

    static void revCharacter(char[] s){
        int start=0;
        int end=s.length-1;

        while(start <= end){
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start ++;
            end--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char s=sc.next().charAt(0);
//        System.out.println(revCharacter(s));
    }
}

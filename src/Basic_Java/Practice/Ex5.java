package Basic_Java.Practice;

public class Ex5 {
    public static void main(String[] args) {
        String str="madam";
        String revStr="";

        for (int i=str.length()-1; i>=0 ; i--){
            revStr=revStr+str.charAt(i);
        }
        if(str.equals(revStr)) {
            System.out.println("String is Palindrome");
        }else {
            System.out.println("String is Not Palindrome");
        }
    }
}

package Basic_Java.String;

public class RevString {
    public static void main(String[] args) {

        String str="Vaibhav";
        String empStr="";
        char ch;

        for (int i=0;i<str.length();i++){
            ch=str.charAt(i);
            empStr=ch+empStr;
        }
        System.out.println(empStr);
    }
}

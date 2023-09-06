package Basic_Java.Practice;

public class Rev_String {
    public static void main(String[] args) {
        String str="ABCDE";
        String revStr="";
        char ch;
        int i=0;
        while (i<str.length()){
            ch=str.charAt(i);
            revStr=ch+revStr;
            i++;
        }
        System.out.println(revStr);

    }
}

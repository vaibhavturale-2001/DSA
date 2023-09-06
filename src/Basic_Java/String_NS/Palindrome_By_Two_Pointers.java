package Basic_Java.String_NS;
public class Palindrome_By_Two_Pointers {

    static boolean checkPalind(String s){
        int ptr1=0;
        int ptr2=s.length()-1;
        while ( ptr1 < ptr2 ){
            if(s.charAt(ptr1) != s.charAt(ptr2)){
                return false;
            }
            ptr1++;
            ptr2--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkPalind("madam"));
        System.out.println(checkPalind("vaibhav"));
    }
}

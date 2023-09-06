package Basic_Java.String_NS;

import java.util.Scanner;

public interface Taking_Input {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String line=sc.nextLine();
        String s=sc.next();
        String t=sc.next();

        System.out.println(line);
        System.out.println(s);
        System.out.println(t);
        System.out.println(s.substring(2,5));
    }
}

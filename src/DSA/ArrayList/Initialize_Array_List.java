package DSA.ArrayList;

import java.util.ArrayList;

public class Initialize_Array_List {
    public static void main(String[] args) {
//        ArrayList<Integer> al=new ArrayList<>();
        ArrayList<Integer> al=new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(4);
        al.add(3);
        al.add(5);
        al.add(5);
        System.out.println(al);
        System.out.println(al.get(2));
        System.out.println(al.size());
        System.out.println(al.remove(0));
        System.out.println(al);
    }
}

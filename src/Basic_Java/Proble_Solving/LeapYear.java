package Basic_Java.Proble_Solving;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        boolean isLeapYear=false;

        if(year%4==0){
            isLeapYear=true;
            if(isLeapYear){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
        if(year%100==0 && year%400!=0){
            isLeapYear=false;
            if(isLeapYear){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }

//        if(isLeapYear){
//            System.out.println("YES");
//        }else {
//            System.out.println("NO");
//        }

    }
}

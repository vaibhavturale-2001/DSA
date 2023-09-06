package Basic_Java.Proble_Solving;

import java.util.Scanner;

public class Student_Grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();

        double percentage=((a+b+c+d+e)/500.0)*100;

        if(percentage>=80){
            System.out.println("A");
        }else if (percentage<80 && percentage>=60){
            System.out.println("B");
        }else if(percentage<60 && percentage>=40){
            System.out.println("C");
        }else{
            System.out.println("D");
        }

    }

}

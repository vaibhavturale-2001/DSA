package Basic_Java.Proble_Solving;

import java.util.Scanner;

public class PrintEvenNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            if(i % 2==0){                     // if(i % 2!=0)---for odd number
                System.out.println(i+" ");
            }
        }
    }
}

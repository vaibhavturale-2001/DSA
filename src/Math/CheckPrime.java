package Math;

import java.util.Scanner;

public class CheckPrime {
    /*
    * Write a function which check if a number is primme or not
    *
    * Input: int n
    * Output: boolean, true if number is true else false
    *
    * A prime number is only divisible by 1 and itself.
    *
    * Time complexity : O (sqrt(n))
    * space complexity : O(1)
    * */

    static boolean checkPrimeOrNot(int n){
       if(n==1){
           return false;
       }
       for(int i=2; i<=(int) Math.sqrt(n);i++){
           if(n%i == 0){
               return false;
           }
       }
        return true;
    }

    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        System.out.println(checkPrimeOrNot(n));
        //   ORRR
        int n=1000000;

        for (int i=0;i<=n;i++){  // O(n)

            if(checkPrimeOrNot(i)){   // O(sqrt(n))
                System.out.println(i +"is prime");
            }
        }
    }
}

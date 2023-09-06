package Basic_Java.Loops;

public class Input_Function{

    static int sum(int a, int b){
        int s=a+b;
        return s;
    }
    static void name(int x,int y){
        System.out.println("Vaibhav Turale");
        int z=x+y;
        System.out.println(z);
    }


    public static void main(String[] args) {
         int s1=sum(10,10);
         int s2=sum(20,20);
         int s3=sum(30,30);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        name(10,200);

    }
}

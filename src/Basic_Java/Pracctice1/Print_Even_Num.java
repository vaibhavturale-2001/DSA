package Basic_Java.Pracctice1;

public class Print_Even_Num {
    public static void main(String[] args) {
        int num=10;
        for (int i=1;i<=num;i++){
            if(i % 2==0){
                System.out.println(i+" ");
            }
        }
    }
}

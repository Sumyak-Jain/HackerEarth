import java.util.Scanner;
public class cheeku{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a<=23 && b>=500 || b<=1000){
            System.out.println("Take Medicine");
        }
        else
        System.out.println("Don't take Medicine");
    }
}

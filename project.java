import java.util.Scanner;
public class project{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c=0;
        for(int  i=0;i<=1000000000;i++){
             c=(i) ^ (i/2);
            if(c==a){
            System.out.println(i);}
        }
    }
}

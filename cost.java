import java.util.Scanner;
public class cost{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long P=sc.nextLong();
        long S=sc.nextLong();
        long T=sc.nextLong();
        long H=sc.nextLong();
        long x=sc.nextLong();
        long sum=0;
        for(int i=1;i<=x;i++){
            if(S>T){
                sum=sum+P;}
            else if(S<=T){
                sum=sum+H;
            }
            S=S-1;
        }
        System.out.println(sum);
    }
}

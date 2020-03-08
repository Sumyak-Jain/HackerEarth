import java.util.Scanner;
public class portion{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        long sum=0;
        for(int i=1;i<=10;i++){
            long b=a%10;
            sum=sum+(b*i);
            a=a/10;
        }
        if(sum%11==0){
            System.out.print("Legal ISBN");
        }
        
        else{
            System.out.println("Illegal ISBN");
        }
    }
}

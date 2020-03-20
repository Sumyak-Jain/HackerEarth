import java.util.Scanner;
public class diwali{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    for(int i=0;i<a;i++){
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int sum=b;
        for(int j=1;j<d;j++){
            sum=sum+c;
        }
        System.out.println(sum);

    }
    }
}

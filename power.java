import java.util.Scanner;
public class power{
    public static void main(String arga[]){
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        int count=0;
        for(long i=0;i<a;i++){
            long n=sc.nextLong();
            if(n==1){
                count++;
            }
            else if((n&(n-1))==0){
                count++;
            }
            
            
        }
        System.out.println(count);
    }
}

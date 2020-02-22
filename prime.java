import java.util.Scanner;
public class prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int i=0;
        int j=0;
        String primes="";
        for( i=1;i<a;i++){
             int count=0;
            for( j=i;j>=1;j--){
                if(i%j==0){
                    count ++;              
                    }}
                    if(count==2){
                        primes= primes + i + " " ;
                    }
            }
        System.out.println(primes);
    }
}

import java.util.Scanner;
import java.math.BigInteger;
public class sum1{
    public  static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        BigInteger arr[]=new BigInteger[a];
         BigInteger sum=new BigInteger("0");
        for(int i=0;i<a;i++){
            arr[i]=sc.nextBigInteger();
        
        }
        for(int i=0;i<a;i++){
            
             sum = sum.add(arr[i]); 
            
        }


        System.out.println(sum);

        
    }
}

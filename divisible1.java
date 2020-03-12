import java.util.Scanner;
import java.math.*;
public class divisible{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int  arr[]=new int[a];
        int arr1[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<(a/2);i++){
             while (arr[i] >= 10)  {
            arr[i] /= 10; }
            arr1[i]=arr[i];
    } 
    for(int i=(a/2);i<a;i++){
            arr1[i]=arr[i]%10;
    } 
    String b="";
     for(int i=0;i<a;i++){
         b=b+arr1[i];

        }
        BigInteger c =new BigInteger(b);
        BigInteger e=new BigInteger("11");
        if(c.mod(e).equals(BigInteger.ZERO)){
            System.out.println("OUI");
        }
        else{
            System.out.println("NON");
        }
        
    }
}

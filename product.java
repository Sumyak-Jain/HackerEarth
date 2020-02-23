import java.util.Scanner;
public class product{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        long  arr[]=new long[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
            
        }
        
        long  count=1;
        for(int i=0;i<a;i++){
            count=(count*arr[i])%(1000000000+7);
        }
        System.out.println(count);
        }
}

import java.util.Scanner;
public class divisible{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long location=-1,min;
        int N=sc.nextInt();
        long arr[]=new long [N];
        long sum=0;
        for(int i =0;i<N;i++){
            arr[i]=sc.nextLong();
            sum=sum+arr[i];
        }
        min=999999;
        for(int i=0;i<N;i++){
            if((sum-arr[i])%7==0){
                if(arr[i]<min){
                min=arr[i];
                location=i;
            }
        }
    }
    if(location==-1){
        System.out.println("-1");
    }
    else{
        System.out.println(location);
    }
    
}}

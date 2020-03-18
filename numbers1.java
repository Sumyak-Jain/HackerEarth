import java.util.Scanner;
import java.util.Arrays;
public class numbers1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
         
        for(int i=0;i<a;i++){
            int count=0;
            for(int j=0;j<a;j++){
               
                if(arr[i]==arr[j]){
                count++;
                }

            }
                if(count==1){
                    System.out.print(arr[i]+" ");
                }
        }}}

import java.util.Scanner;
import java.util.Arrays;
public class pattern{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int b=arr[0]+arr[a-1];
        System.out.println(b);
    }
}

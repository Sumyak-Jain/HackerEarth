import java.util.Scanner;
public class sum{
    public static void main(String args[]){
          char arr[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int n=a.length();
        int p=arr.length;
        int sum=0;
        
        char arr1[]=a.toCharArray();
        for(int i=0;i<n;i++){
            for(int j=0;j<p;j++){
                if(arr1[i]==arr[j]){
                    sum=sum+(j+1);
                }
            }
            
        }
    System.out.println(sum);
               
    }
}

import java.util.Scanner;
public class ques_2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int X=sc.nextInt();
        int Y=sc.nextInt();
        
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        Boolean b1=true;
         Boolean b2 = false;  
        for(int i=0;i<a;i++){
            if(arr[i]>=X && arr[i]<=Y)
            b2=true;
            else{
                break;
            }

        }
        if (b1.equals(b2)) {  
            System.out.println("YES");}
            else{
                System.out.println("NO");
            }
    }
}

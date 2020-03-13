import java.util.Scanner;
public class birthday{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(c%b==0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}

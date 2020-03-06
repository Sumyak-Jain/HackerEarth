import java.util.Scanner;
public class life{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<100000;i++){
            int a=sc.nextInt();
             if(a!=42){
                System.out.println(a);
            }
            else if(a==42){
                break;
            }
        }  
      
    }
}

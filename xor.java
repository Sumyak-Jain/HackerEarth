import java.util.Scanner;
public class xor{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
       
        int max=0;
        
        int f=0;
        int B=A;
        int C=0;
        
       
        for(int j=0;j<=163;j++){
            f=A^j;
                if(f>=max){
                    max=f;
                    C=j;
                }
            
        }

        System.out.println(B+" "+C);

    }
}

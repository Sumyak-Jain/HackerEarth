import java.util.Scanner;
public class Zoo{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        char[] ch=a.toCharArray();
        int z=0;
        int o=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='z')
            z++;
            else
            o++;
            
        }
        if((2*z)==o){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}

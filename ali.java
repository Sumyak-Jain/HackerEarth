import java.util.Scanner;
public class ali{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
         char[] ch = a.toCharArray(); 
         if(ch[2]=='A')
         {
             System.out.println("invalid");
         }
         else if(ch[2]=='E')
         {
             System.out.println("invalid");
         }
         else if(ch[2]=='I')
         {
             System.out.println("invalid");
         }
         else if(ch[2]=='O')
         {
             System.out.println("invalid");
         }
         else if(ch[2]=='U')
         {
             System.out.println("invalid");
         }
         else if(ch[2]=='Y')
         {
             System.out.println("invalid");
         }
         else if((ch[0]+ch[1])%2!=0)
         {
             System.out.println("invalid");
         }
         else if((ch[3]+ch[4])%2!=0)
         {
             System.out.println("invalid");
         }
         else if((ch[4]+ch[5])%2!=0)
         {
             System.out.println("invalid");
         }
         
         else if((ch[7]+ch[8])%2!=0)
         {
             System.out.println("invalid");
         }
         else{
             System.out.println("valid");
         }

    }
}

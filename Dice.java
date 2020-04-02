import java.util.Scanner;
public class Dice{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char ch[]=s.toCharArray();
         int n=ch[ch.length-1];
        if(n=='6'){
            System.out.println("-1");
        }
        else{
        int count =0;
        for(int i=0;i<ch.length;i++){
            if(ch[i] - '0' !=6){
            count++;
            }
            
        }
       
        System.out.println(count);
    }
    }
}

import java.util.Scanner;
public class fitting {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++){
           int c2=0;
           Long count=new Long(c2);
            long  b=sc.nextLong();
            long  c=sc.nextLong();
            int t1=0;
            int f1=0;
			Long t=new Long(t1);
            Long f=new Long(f1);
            if(b<=c)
			{
			t=b;
			f=c;
			}
			else if(c<=b)
			{
			t=c;
			f=b;
			}
			count=f/t;
            
            System.out.println(count);
        }

    }
}

import java.util.*;
class profile {
public static void main(String args[] ) throws Exception {
int l,n,w,h;
Scanner sc = new Scanner(System.in);
l=sc.nextInt();
n=sc.nextInt();
for(int i=0;i<n;i++)
{
w=sc.nextInt();
h=sc.nextInt();
if(((w==l) && (h==l))||((w==h)&&(w>l)))
System.out.println("ACCEPTED");
else if(((w<l)||(h<l)))
System.out.println("UPLOAD ANOTHER");
else if(((w>l)||(h>l))||((w>l) && (h==l))||((h==l)&&(w>l)))
System.out.println("CROP IT");
}
}
}

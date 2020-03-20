#include <stdio.h>
#define SIZE 100000
int main()
{
 int t,i,j,c;
 scanf("%d",&t);
 while(t--)
 {
  char str[SIZE]={'\0'};
  c=0;
  scanf("%s",str);
  for(i=0;str[i]!='\0';i++)
  {
   if(str[i]=='B')
   {
    for(j=1;j<=2;j++)
    {
     if(str[i+j]=='W')
     {
      c++;
      str[i+j]='a';
     }
     if(str[i-j]=='W')
     {
      c++;
      str[i-j]='a';
     }
    }
   }
  }
  printf("%d\n",c);
 }
    return 0;
}

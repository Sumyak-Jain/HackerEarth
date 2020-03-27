#include <iostream>
#include <string>
using namespace std;
 
int main()
{
    string x;
    cin>>x;
    int k;
    cin>>k;
    int len=x.length();
    int index=0,i=1;//i for k times loop index for string index
    while(i<=k && index<len)
    {
    	if(x[index]!='9') {
    		x[index] ='9';
    		i++;
    	}
    	index++;
    }
    cout<<x<<endl;
}

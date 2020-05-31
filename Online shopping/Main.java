#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,e,f,g,h,i,j,k,l,m,n,o;
  cin>>a>>b>>c>>d>>e>>f>>g>>h>>i;
  j=a*((float)b/100);
  m=(a-j)+c;
  k=d*((float)e/100);
  n=(d-k)+f;
  l=g*((float)h/100);
  o=(g-l)+i;
     cout<<"In Flipkart Rs."<<m<<"\n";
     cout<<"In Snapdeal Rs."<<n<<"\n";
     cout<<"In Amazon Rs."<<o<<"\n";
  if((m==n) && n<o)
  {
    cout<<"He will prefer Flipkart";
  }
     else if(m<n && m<o)
     {
       cout<<"He will prefer Flipkart";
     }
     else if(n<o)
     {
       cout<<"He will prefer Snapdeal";
     }
     else
     {
       cout<<"He will prefer Amazon";
     }
     
}
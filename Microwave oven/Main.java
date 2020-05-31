#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  cout<<fixed<<setprecision(2);
  int a;
  float b;
  cin>>a>>b;
  if(a>3)
  {
    cout<<"Number of items is more";
  }
  if(a<=3){
    if(a==1)
       {
         cout<<b;
       }
     else if(a==2)
       {
         cout<<(b*((float)50/100))+b;
       }
       else
       {
         cout<<2*b;
       }
       }
         
}
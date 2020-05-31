#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int a;
  double b;
  cin>>a>>b;
  cout<<fixed<<setprecision(2);
  if((a>13&&b==10.15) || (a>13 && b==18.00))
  {
    cout<<"$8.00";
  }
  if((a<13&&b==10.15) || (a<13 && b==18.00))
  {
    cout<<"$4.00";
  }
  if((a>13&&b==13.30) || (a>13 && b==22.00))
  {
    cout<<"$5.00";
  }
  if((a<13&&b==13.30) || (a<13 && b==22.00))
  {
    cout<<"$2.00";
  }
  
}
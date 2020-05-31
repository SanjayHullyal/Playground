#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  float n,sum=0.5;
  cin>>n;
  cout<<fixed<<setprecision(1);
  cout<<sum<<" ";
  for(int i=2;i<=n;i++)
  {
      sum=sum*3;
    cout<<sum<<" ";
    }
  }

  
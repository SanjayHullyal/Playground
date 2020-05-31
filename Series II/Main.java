#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  cout<<(11+4*0)*(11+4*0)<<" ";
  for(int i=1;i<n;i++)
  {
    cout<<(11+4*i)*(11+4*i)<<" ";
  }
}
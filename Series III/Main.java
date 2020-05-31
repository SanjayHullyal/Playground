#include<iostream>
using namespace std;
int main()
{
  int n,sum=6;
  cin>>n;
  cout<<sum<<" ";
for(int i=1;i<n;i++)
{
  sum=sum+5*i;
  cout<<sum<<" ";
}
}
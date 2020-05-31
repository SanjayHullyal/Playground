#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,sum=1;
  cin>>n;
  for(int i=1;i<=n;i++)
  {
    if(i%2==0)
    {
    sum=i*i-2;
    cout<<sum<<" ";
    }
    else
    {
       sum=i*i-1;
       cout<<sum<<" ";
    }
  }
}
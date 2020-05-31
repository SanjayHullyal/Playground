#include<iostream>
using namespace std;
int facto(int b)
{
  if(b>1)
  {
 return b*facto(b-1);
  }
  else
    {
     return 1;
    }
}
int main()
{
  int n;
  cin>>n;
 cout<<"The factorial of "<<n<<" is "<< facto(n);
  return 0;
}
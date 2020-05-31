#include <iostream>
using namespace std;
int main() 
{
  int a,b , sum = 0,u=1;
  cin>>a>>b;
  while (a <= b ) 
  {
    while (u <= b) 
    {
      if (u < a) 
      {
        if (a % u == 0)
          sum = sum + u;
      }
      u++;
    }
    if (sum == a) {
      cout << a << " ";
    }
    a++;
    u=1;
    sum=0;
 
  }
}
          
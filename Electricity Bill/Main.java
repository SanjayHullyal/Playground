#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a;
  int b;
  cin>>a;
  if(a>0 && a<=200){
    b=0.5*a;
    cout<<"Rs."<<b;
  }
  else if(a>200 && a<=400){
    cout<<"Rs."<<((int)0.65*a)+100;
  }
  else if(a>400 && a<=600){
    cout<<"Rs."<<((float)0.80*a)+200;
  }
  else if(a>600){
    cout<<"Rs."<<((float)1.25*a)+425;
  }
  else{
    cout<<"";
  }
}
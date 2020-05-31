#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a;
  string b;
  cin>>a;
  if(a%4==0){
    b=" is a leap year";
    cout<<a<<b;
  }
  else{
    b=" is not a leap year";
    cout<<a<<b;
  }
}
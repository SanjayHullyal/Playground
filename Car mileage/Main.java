#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float a;
  int b,c;
  string h="Can reach";
  string k="Cannot reach";
  cin>>a>>b>>c;
  float d=b*a;
  float e=c/d;
  if(c<d){
    cout<<h;
  }
  else
    cout<<k;
}
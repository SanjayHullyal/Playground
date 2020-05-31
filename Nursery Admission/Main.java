#include<iostream>
using namespace std;
int main()
{
  string str1;
  int count=0,i=0;
  cin>>str1;
  while(str1[i]!='\0')
  {
    count=count+1;
    i++;
  }
  cout<<"The number of letters in the name is "<<count;
}
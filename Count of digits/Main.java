#include<iostream>
int main()
{
  // Type your code here
  int n,count=0,temp;
  std::cin>>n;
  temp=n;
  do{
    temp=temp/10;
    count=count+1;
  }while(temp!=0);
  std::cout<<count;
}
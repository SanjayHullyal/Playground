#include<iostream>
int main(){
  int x;
  std::cin>>x;
  int y=x%2;
  if(y==0){
    std::cout<<"Possible";
  }
  else{
    std::cout<<"Not possible";
  }
}
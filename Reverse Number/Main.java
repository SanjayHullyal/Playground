#include <iostream>
int main() 
{
	// Type your code here
  int n,reverseNumber=0;
  std::cin>>n;
  while(n!=0){
    int remainder=n%10;
    reverseNumber=reverseNumber*10 + remainder;
    n=n/10;
  }
  std::cout<<reverseNumber;
	return 0;
}
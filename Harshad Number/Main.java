#include <iostream>
using namespace std;
//main program
int main()  
{  
    int num,sum = 0;  
    //user input
    cin>>num;

    //loop to calculate the sum of digits
  int n=num;
    while(num > 0)
    {  
        int rem = num%10;  
        sum = sum + rem;  
        num = num/10;  
    }      
    //checking for harshad number
    if(n % sum == 0)  
        cout<<"Harshad Number";  
    else  
        cout<<"Not Harshad Number";
    return 0;  
    }
#include<iostream>
using namespace std;
int main()
{
    int year;
    cout<<"enter a year"<<endl;
    cin>>year;
    if(year%4==0 and year%100!=0 or year%400==0)
    {
        cout<<"year  "<<year<<" is leap"<<endl;
    }
    else{
        cout<<"year "<<year<<" is not leap"<<endl;
    }
}
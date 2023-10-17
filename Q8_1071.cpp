/*Name-Aditya Sahu
*Regd no.-2241019168
*PS link-https://cses.fi/problemset/task/1071
*/
#include<iostream>
#include<bits/stdc++.h>
typedef long long ll ;
using namespace std;
int main(){
    ll test;
	cin>>test;
	while(test--){
		ll y,x;
		cin>>y>>x;
		if(x>y)
		{
			if(x%2==1)
				cout<<(x*x-y+1)<<endl;
			else
			{
				x--;
				cout<<(x*x+y)<<endl;
			}
		}
		else
		{
			if(y%2==0)
				cout<<y*y+1-x<<endl;
			else
			{
				y--;
				cout<<y*y+x<<endl;
			}
		}
    }
}

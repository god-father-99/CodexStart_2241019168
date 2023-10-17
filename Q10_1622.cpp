/*Name-Aditya Sahu
*Regd no.-2241019168
*PS link-https://cses.fi/problemset/task/1622
*/
#include<iostream>
#include<bits/stdc++.h>
typedef long long ll ;
#define pb push_back
using namespace std;
int main(){
    string s;
	cin>>s;
	sort(s.begin(),s.end());
    string check=s;
	vector<string> v;
	v.pb(s);
	while(1)
	{
		next_permutation(s.begin(),s.end());
		if(s==check)
			break;
		else
			v.pb(s);
	}
	cout<<v.size()<<endl;
	for(auto s:v)
		cout<<s<<endl;
}
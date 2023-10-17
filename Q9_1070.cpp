/*Name-Aditya Sahu
*Regd no.-2241019168
*PS link-https://cses.fi/problemset/task/1070
*/
#include<iostream>
#include<bits/stdc++.h>
typedef long long ll ;
#define pb push_back
using namespace std;
int main(){
    ll n;
    cin>>n;
    if(n==1)
    cout<<n<<endl;
    else if(n<=3)
    cout<<"NO SOLUTION";
    else{
        vector<long>even;
        vector<long>odd;
        for(ll i=1;i<=n;i++){
			if(i%2==0)
				even.pb(i);
			else
				odd.pb(i);
		}
		for(auto e:even){
			cout<<e<<" ";
        }
		for(auto e:odd){
			cout<<e<<" ";
        }
        cout<<endl;
    }
}
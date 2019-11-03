#include <bits/stdc++.h>
using namespace std;

int main(){
    int a,b,c;
    while(cin>>a && a!=0){
        cin>>b>>c;
        cout<<(int)(sqrt((a*b)*100/c))<<'\n';
    }
    return 0;
}

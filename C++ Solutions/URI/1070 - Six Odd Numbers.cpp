#include <bits/stdc++.h>
using namespace std;

int main()
{
    int x,c=0;
    cin>>x;
    int i=x;
    while(c<6){
        if(i%2){
            cout<<i<<'\n';
            c++;
        }
        i++;
    }
    return 0;
}

#include <bits/stdc++.h>
using namespace std;

int main()
{
    int x,y,n;
    cin>>n;
    while(n--){
        cin>>x>>y;
        if(y==0) cout<<"divisao impossivel\n";
        else printf("%.1lf\n",(double)x/(double)y);
    }
    return 0;
}

#include <bits/stdc++.h>
using namespace std;

int main()
{
    double x,p=0;
    for(int i=0;i<6;i++){
        cin>>x;
        if(x>=0) p++;
    }
    cout<<(int)p<<" valores positivos\n";
    return 0;
}

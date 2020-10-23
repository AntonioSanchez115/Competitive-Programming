#include <bits/stdc++.h>
using namespace std;

int main()
{
    int c=7;
    for(int i=1;i<=9;i+=2){
        for(int j=c;j>=c-2;j--){
            cout<<"I="<<i<<" J="<<j<<'\n';
        }
        c+=2;
    }
    return 0;
}

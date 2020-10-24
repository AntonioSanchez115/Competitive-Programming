#include <bits/stdc++.h>
using namespace std;

int main()
{
    double d = 0.0;
    for(double i=0;i<=2;i+=0.2){
        for(double j=1;j<=3;j++){
            cout<<"I="<<i<<" J="<<j+d<<'\n';
        }
        d += 0.2;
    }

    return 0;
}

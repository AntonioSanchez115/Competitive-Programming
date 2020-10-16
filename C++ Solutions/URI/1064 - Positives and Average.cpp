#include <bits/stdc++.h>
using namespace std;

int main()
{
    double x,p=0,t=0;
    for(int i=0;i<6;i++){
        cin>>x;
        if(x>=0){
            p++;
            t+=x;
        }
    }
    printf("%d valores positivos\n%.1lf\n",(int)p,t/p);
    return 0;
}

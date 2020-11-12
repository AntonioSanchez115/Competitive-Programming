#include <bits/stdc++.h>
using namespace std;

int main()
{
    double a,sum=0,n=0;
    while(cin>>a && a>0){
        sum+=a;
        n++;
    }
    printf("%.2f\n",sum/n);
    return 0;
}

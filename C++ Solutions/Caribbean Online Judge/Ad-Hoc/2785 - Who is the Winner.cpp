#include <bits/stdc++.h>
using namespace std;

int main()
{
    double n,sum=0,x;
    cin>>n;
    for(int i=0;i<n;i++){
        cin>>x;
        sum+=x;
    }
    printf("%.2f\n",sum/n);
    return 0;
}

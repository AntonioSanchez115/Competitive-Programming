#include <bits/stdc++.h>
using namespace std;

int main()
{
    double n;
    cin>>n;
    for(int i=0;i<100;i++,n/=2.0) printf("N[%d] = %.4f\n",i,n);
    return 0;
}

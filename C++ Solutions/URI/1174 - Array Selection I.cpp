#include <bits/stdc++.h>
using namespace std;

int main()
{
    double n;
    for(int i=0;i<100;i++){
        cin >> n;
        if(n>10.0) continue;
        else printf("A[%d] = %.1f\n",i,n);
    }
    return 0;
}

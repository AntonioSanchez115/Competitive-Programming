#include <bits/stdc++.h>
using namespace std;

int main()
{
    double n,a,b,lowest=INT_MAX;
    cin >> n;
    for(int i=0;i<n;i++){
        cin >> a >> b;
        lowest = min(lowest,(a/b*1000.0));
    }
    printf("%.2f\n",lowest);
    return 0;
}

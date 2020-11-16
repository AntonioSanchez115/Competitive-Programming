#include <bits/stdc++.h>
using namespace std;

int main()
{
    double x,low=INT_MAX,high=INT_MIN,sum=0.0;
    for(int i=0;i<5;i++){
        cin >> x;
        low = min(low,x);
        high = max(high,x);
        sum+=x;
    }
    printf("%.1f\n",sum-(low+high));
    return 0;
}

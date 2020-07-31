#include <bits/stdc++.h>

using namespace std;

int main()
{
    long n; cin>>n;
    double p = n / log((double)n);
    double m = (n / log((double)n))*1.25506;
    printf("%.1lf %.1lf\n",p,m);
    return 0;
}

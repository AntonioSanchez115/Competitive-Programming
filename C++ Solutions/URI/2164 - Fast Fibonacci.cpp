#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n; cin>>n;
    double F = (pow(((1+sqrt(5.0))/2.0),n) - pow(((1-sqrt(5.0))/2.0),n))/sqrt(5.0);
    printf("%.1lf\n",F);
    return 0;
}

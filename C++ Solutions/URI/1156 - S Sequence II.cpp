#include <bits/stdc++.h>
using namespace std;

int main()
{
    double s=1.0;
    for(double i=3.0,j=2.0;i<=39;i+=2.0,j*=2.0) s+=(i/j);
    printf("%.2f\n",s);
    return 0;
}

#include <bits/stdc++.h>
using namespace std;

int main()
{
    double s=1.0;
    for(double i=2;i<=100;i++) s+=1/i;
    printf("%.2f\n",s);
    return 0;
}

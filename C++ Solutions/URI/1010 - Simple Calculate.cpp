#include <bits/stdc++.h>

using namespace std;

int main()
{
    int a,b;
    double c,r;
    cin>>a>>b>>c;
    r=b*c;
    cin>>a>>b>>c;
    r+=b*c;
    printf("VALOR A PAGAR: R$ %.2lf\n",r);
    return 0;
}

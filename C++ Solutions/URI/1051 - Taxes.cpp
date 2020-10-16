#include <bits/stdc++.h>
using namespace std;

int main()
{
    double n;
    cin>>n;
    if(n<=2000.0) cout<<"Isento\n";
    else if(n<=3000.0) printf("R$ %.2lf\n",(n-2000)*0.08);
    else if(n<=4500.0) printf("R$ %.2lf\n",80+(n-3000)*0.18);
    else printf("R$ %.2lf\n",350+(n-4500)*0.28);
    return 0;
}

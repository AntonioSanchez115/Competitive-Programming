#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cin>>n;
    while(n--){
        double a,b,c;
        cin>>a>>b>>c;
        printf("%.1lf\n",((a*2+b*3+c*5)/10.0));
    }
    return 0;
}

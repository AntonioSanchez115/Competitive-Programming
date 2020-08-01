#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n; cin>>n;
    double F=0.0;
    for(int i=0;i<n;i++){
        if(i==0) F=1/2.0;
        else F=1/(2+F);
    }
    printf("%.10lf\n",(1+F));
    return 0;
}

#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n; cin>>n;
    double F=0.0;
    for(int i=0;i<n;i++){
        if(i==0) F=1/6.0;
        else F=1/(6+F);
    }
    printf("%.10lf\n",(3+F));
    return 0;
}

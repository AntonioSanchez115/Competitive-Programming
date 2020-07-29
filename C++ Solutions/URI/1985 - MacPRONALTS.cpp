#include <bits/stdc++.h>

using namespace std;

int main()
{
    int p,id,n; cin>>p;
    double prices[5] = {1.5,2.5,3.5,4.5,5.5};
    double res=0;
    for(int i=0;i<p;i++){
        cin>>id>>n;
        res+=prices[(id%10)-1]*n;
    }

    printf("%.2lf\n",res);
    return 0;
}

#include <bits/stdc++.h>

using namespace std;

int main()
{
    int t;cin>>t;
    while(t--){
        string s;
        cin>>s;
        double t=0;
        for(int i=0;i<s.size();i++) t+=0.01;
        printf("%.2lf\n",t);
    }
    return 0;
}

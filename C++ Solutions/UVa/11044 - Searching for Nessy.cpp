#include <bits/stdc++.h>
using namespace std;

int main()
{
    long a,b,c;
    cin>>c;
    while(c--){
        cin>>a>>b;
        printf("%ld\n",(long)(ceil((a-2) / (double)3) * ceil((b-2) / (double)3)));
    }
    return 0;
}

#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cin>>n;
    for(long i=1;i<=n;i++){
        printf("%ld %ld %ld\n",i,i*i,i*i*i);
        printf("%ld %ld %ld\n",i,i*i+1,i*i*i+1);
    }
    return 0;
}

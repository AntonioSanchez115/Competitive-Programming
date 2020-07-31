#include <bits/stdc++.h>

using namespace std;

int main()
{
    int t; cin>>t;
    while(t--){
        int h,m,o;
        cin>>h>>m>>o;
        printf("%02d:%02d - A porta ",h,m);
        cout<<((o==1)?"abriu!\n":"fechou!\n");
    }
    return 0;
}

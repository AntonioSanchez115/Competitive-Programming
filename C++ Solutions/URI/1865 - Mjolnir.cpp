#include <bits/stdc++.h>

using namespace std;

int main()
{
    ios_base::sync_with_stdio(false);
    int c;
    cin>>c;
    while(c--){
        string name;
        int force;
        cin>>name>>force;
        if(name=="Thor" && force >= 1) cout<<"Y\n";
        else cout<<"N\n";
    }
    return 0;
}

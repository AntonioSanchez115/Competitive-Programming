#include <bits/stdc++.h>

using namespace std;

int main()
{
    int t,x,y;
    string r[11]={"PROXYCITY","P.Y.N.G.","DNSUEY!","SERVERS","HOST!","CRIPTONIZE","OFFLINE DAY","SALT","ANSWER!","RAR?","WIFI ANTENNAS"};
    cin>>t;
    while(t--){
        cin>>x>>y;
        cout<<r[x+y]<<'\n';
    }
    return 0;
}

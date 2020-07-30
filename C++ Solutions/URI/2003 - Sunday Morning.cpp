#include <bits/stdc++.h>

using namespace std;

int main()
{
    string h;
    while(cin>>h){
        int bino = (h[0]-'0')*60 + atoi(h.substr(2,2).c_str());
        cout<<"Atraso maximo: ";
        cout<<((bino<=420)?0:(bino-420));
        cout<<'\n';
    }
    return 0;
}

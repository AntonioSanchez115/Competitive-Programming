#include <bits/stdc++.h>

using namespace std;

int main()
{
    int c; cin>>c;
    while(c--){
        string n1,n2,c1,c2;
        cin>>n1>>c1>>n2>>c2;
        int a,b;
        cin>>a>>b;
        if((a+b)%2){
            cout<< ((c1 == "IMPAR") ? n1 : n2);
        }else{
            cout<< ((c1 == "PAR") ? n1 : n2);
        }
        cout<<'\n';
    }
    return 0;
}

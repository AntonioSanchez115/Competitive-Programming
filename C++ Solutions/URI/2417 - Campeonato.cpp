#include <bits/stdc++.h>
using namespace std;

int main()
{
    int cv,ce,cs,fv,fe,fs;
    cin>> cv >> ce >> cs >> fv >> fe >> fs;
    cv = cv*3+ce;
    fv = fv*3+fe;
    if(cv==fv){
        if(cs==fs) cout<<"=\n";
        else cout << ((cs>fs) ? "C\n" : "F\n");
    }else cout << ((cv>fv) ? "C\n" : "F\n");
    return 0;
}

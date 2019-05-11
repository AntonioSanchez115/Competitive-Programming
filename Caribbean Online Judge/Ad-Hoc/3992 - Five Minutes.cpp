#include <bits/stdc++.h>
using namespace std;

int main(){
    int h,m,t;
    char c;
    cin>>h>>c>>m;
    if(h<6) t=(h-1)*60+m;
    else t=(h-7)*60+m;
    if(t>=0 && t<45) cout<<"Students, Surprise Quiz!\n";
    else if(t>=50 && t<95) cout<<"Students, Surprise Quiz!\n";
    else if(t>=100 && t<145) cout<<"Students, Surprise Quiz!\n";
    else if(t>=150 && t<195) cout<<"Students, Surprise Quiz!\n";
    else if(t>=200 && t<245) cout<<"Students, Surprise Quiz!\n";
    else if(t>=250 && t<295) cout<<"Students, Surprise Quiz!\n";
    else cout<<"Students, you may go out.\n";
    return 0;
}

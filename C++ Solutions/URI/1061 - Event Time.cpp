#include <bits/stdc++.h>
using namespace std;

int main()
{
    int di,df,hi,hf,mi,mf,si,sf,d=0,h=0,m=0,s=0,st=0;
    string str;
    cin>>str>>di>>hi>>str>>mi>>str>>si;
    cin>>str>>df>>hf>>str>>mf>>str>>sf;
    di = (df-di)*86400;
    hi = (hf-hi)*3600;
    mi = (mf-mi)*60;
    si = sf-si;
    st = di + hi + mi + si;
    while(st>=86400) st-=86400,d++;
    while(st>=3600) st-=3600,h++;
    while(st>=60) st-=60,m++;
    s = st;
    cout<<d<<" dia(s)\n"<<h<<" hora(s)\n"<<m<<" minuto(s)\n"<<s<<" segundo(s)\n";
    return 0;
}

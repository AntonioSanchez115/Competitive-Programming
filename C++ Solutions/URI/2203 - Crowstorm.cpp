#include <bits/stdc++.h>

using namespace std;

int main()
{
    int xf,yf,xi,yi,v,r1,r2;
    while(cin>>xf>>yf>>xi>>yi>>v>>r1>>r2){
        double dist = sqrt((pow((xi-xf),2)+pow((yi-yf),2)));
        double attackDist = r1+r2;
        if(v!=0) dist+=(v*1.5);
        cout<<((dist<=attackDist)?"Y\n":"N\n");
    }
    return 0;
}

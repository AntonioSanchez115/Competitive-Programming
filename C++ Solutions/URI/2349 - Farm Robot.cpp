#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n,c,s,x,robot=1,times=0;
    cin >> n >> c >> s;
    for(int i=0;i<c;i++){
        cin >> x;
        if(robot==s) times++;
        if(x==1) robot++;
        else robot--;
        if(robot==n+1) robot=1;
        if(robot==0) robot=n;
    }
    if(robot==s) times++;
    cout << times << '\n';
    return 0;
}

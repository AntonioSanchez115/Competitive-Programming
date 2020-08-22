#include <bits/stdc++.h>

using namespace std;

int main()
{
    int m;
    while(cin>>m){
        int n,c,Enxc=0,Ec=0;
        for(int i=0;i<m;i++){
            cin>>n>>c;
            Enxc+=(n*c);
            Ec+=c;
        }
        Ec*=100;
        printf("%.4lf\n",((double)Enxc/(double)Ec));
    }
    return 0;
}

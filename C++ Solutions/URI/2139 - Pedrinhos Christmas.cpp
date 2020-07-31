#include <bits/stdc++.h>

using namespace std;

int main()
{
    int m,d,y[12]={31,29,31,30,31,30,31,31,30,31,30,31};
    while(cin>>m>>d){
        int x=0;
        for(int i=0;i<m-1;i++) x+=y[i];
        x+=d;
        if(x<359) cout<<"Faltam "<<360-x<<" dias para o natal!\n";
        else if(x==359) cout<<"E vespera de natal!\n";
        else if(x==360) cout<<"E natal!\n";
        else cout<<"Ja passou!\n";
    }
    return 0;
}

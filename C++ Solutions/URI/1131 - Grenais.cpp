#include <bits/stdc++.h>
using namespace std;

int main()
{
    int i,g,G=0,inter=0,gremio=0,draw=0,r=1;
    while(r==1){
        cin>>i>>g;
        if(i>g) inter++;
        if(i<g) gremio++;
        if(i==g) draw++;
        G++;
        cout<<"Novo grenal (1-sim 2-nao)\n";
        cin>>r;
    }
    cout<<G<<" grenais\n";
    cout<<"Inter:"<<inter<<"\nGremio:"<<gremio<<"\nEmpates:"<<draw<<'\n';
    if(inter==gremio) cout<<"Não houve vencedor\n";
    else cout<<((inter>gremio) ? "Inter venceu mais\n" : "Grenais venceu mais\n");
    return 0;
}

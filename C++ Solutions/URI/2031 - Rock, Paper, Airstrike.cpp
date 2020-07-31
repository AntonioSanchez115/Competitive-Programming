#include <bits/stdc++.h>

using namespace std;

int main()
{
    int tc;
    cin>>tc;
    while(tc--){
        string p1,p2;
        cin>>p1>>p2;
        if(p1=="ataque"){
            if(p2=="pedra" || p2=="papel") cout<<"Jogador 1 venceu\n";
            else cout<<"Aniquilacao mutua\n";
        }else if(p1=="pedra"){
            if(p2=="pedra") cout<<"Sem ganhador\n";
            else if(p2=="papel") cout<<"Jogador 1 venceu\n";
            else cout<<"Jogador 2 venceu\n";
        }else{
            if(p2=="pedra") cout<<"Jogador 2 venceu\n";
            else if(p2=="papel") cout<<"Ambos venceram\n";
            else cout<<"Jogador 2 venceu\n";
        }
    }
    return 0;
}

#include <bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin>>t;
    while(t--){
        priority_queue<int,vector<int>,greater<int>> godzillaArmy;
        priority_queue<int,vector<int>,greater<int>> mechaGodArmy;
        int ng,nm,n;
        cin>>ng>>nm;
        for(int i=0;i<ng;i++){
            cin>>n;
            godzillaArmy.push(n);
        }
        for(int i=0;i<nm;i++){
            cin>>n;
            mechaGodArmy.push(n);
        }
        while(!godzillaArmy.empty() && !mechaGodArmy.empty()){
            if(godzillaArmy.top() == mechaGodArmy.top()) mechaGodArmy.pop();
            else if(godzillaArmy.top() < mechaGodArmy.top()) godzillaArmy.pop();
            else mechaGodArmy.pop();
        }
        if(godzillaArmy.empty()) cout<<"MechaGodzilla\n";
        else cout<<"Godzilla\n";
    }
    return 0;
}

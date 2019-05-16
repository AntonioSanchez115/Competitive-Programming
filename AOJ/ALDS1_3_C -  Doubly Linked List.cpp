#include <bits/stdc++.h>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false); cin.tie(0);
    list<long> L;
    long n,v; cin>>n;
    while(n--){
        long v;
        string str;
        cin>>str;
        if(str=="insert"){
            cin>>v;
            L.push_front(v);
        }else if(str=="delete"){
            bool band=false;
            list<long>::iterator it = L.begin();
            cin>>v;
            for(auto x:L){
                if(x==v){
                    band=true;
                    break;
                }
                it++;
            }
            if(band) L.erase(it);
        }else if(str=="deleteFirst") L.pop_front();
        else if(str=="deleteLast") L.pop_back();
    }
    cout<<L.front();
    L.pop_front();
    for(auto x:L) cout<<' '<<x;
    cout<<'\n';
    return 0;
}

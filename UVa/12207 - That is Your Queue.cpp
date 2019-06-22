#include <bits/stdc++.h>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false); cin.tie(0);
    long p;
    int c,t=1;
    char com;
    while(cin>>p>>c && p!=0){
        long x,m;
        list<long> L;
        m=min(p,1000L);
        for(int i=0;i<m;i++) L.push_back(i+1);
        cout<<"Case "<<t++<<":\n";
        for(int i=0;i<c;i++){
            cin>>com;
            if(com=='N'){
                cout<<L.front()<<'\n';
                L.push_back(L.front());
                L.pop_front();
            }else{
                cin>>x;
                list<long>::iterator it=L.begin();
                for(int j=0;j<L.size();j++){
                    if(*it==x){
                        L.erase(it);
                        break;
                    }else it++;
                }
                L.push_front(x);
            }
        }
    }
    return 0;
}

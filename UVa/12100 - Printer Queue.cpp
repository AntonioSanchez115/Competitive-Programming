#include <bits/stdc++.h>
using namespace std;
typedef pair<int,int> ii;
int main(){
    int t; cin>>t;
    while(t--){
        int n,m,aux,minutes=0;
        cin>>n>>m;
        queue<ii> jobs,qaux;
        for(int i=0;i<n;i++){
            cin>>aux;
            jobs.push(ii(aux,i));
        }
        while(true){
            bool highPrior = false;
            aux=jobs.front().first;
            while(!jobs.empty()){
                qaux.push(ii(jobs.front().first,jobs.front().second));
                jobs.pop();
                if(!jobs.empty() && jobs.front().first>aux) highPrior = true;
            }
            while(!qaux.empty()){
                jobs.push(ii(qaux.front().first,qaux.front().second));
                qaux.pop();
            }
            if(!highPrior){
                if(jobs.front().second == m) break;
                jobs.pop();
                minutes++;
            }else{
                jobs.push(ii(jobs.front().first,jobs.front().second));
                jobs.pop();
            }
        }
        cout<<++minutes<<'\n';
    }
    return 0;
}

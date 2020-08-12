#include <bits/stdc++.h>

using namespace std;

int main()
{
    int t;
    while(cin>>t){
        int E[t],X[t],Y[t],Z[t],nonPassed=0;
        bool P[t],V[t];
        for(int i=0;i<t;i++){
            P[i]=false;
            V[i]=false;
        }
        char eq,R[t];
        string names[t];
        for(int i=0;i<t;i++){
            char eq;
            cin>>X[i]>>Y[i]>>eq>>Z[i];
            if((X[i]+Y[i]==Z[i]) || (X[i]-Y[i]==Z[i]) || (X[i]*Y[i]==Z[i])){
                V[i]=true;
            }
        }
        for(int i=0;i<t;i++){
            char eq;
            cin>>names[i]>>E[i]>>R[i];
            if(R[i]=='+'){
                if(X[E[i]-1]+Y[E[i]-1]==Z[E[i]-1]) P[i]=true;
            }else if(R[i]=='-'){
                if(X[E[i]-1]-Y[E[i]-1]==Z[E[i]-1]) P[i]=true;
            }else if(R[i]=='*'){
                if(X[E[i]-1]*Y[E[i]-1]==Z[E[i]-1]) P[i]=true;
            }else{//R[i]=='I'
                if(!V[E[i]-1]) P[i]=true;
            }
            if(!P[i]) nonPassed++;
        }
        if(nonPassed==t) cout<<"None Shall Pass!\n";
        else if(nonPassed==0) cout<<"You Shall All Pass!\n";
        else{
            priority_queue<string, vector<string>, greater<string>> pq;
            for(int i=0;i<t;i++){
                if(!P[i]) pq.push(names[i]);
            }
            cout<<pq.top();
            pq.pop();
            while(!pq.empty()){
                cout<<' '<<pq.top();
                pq.pop();
            }
            cout<<'\n';
        }
    }
    return 0;
}

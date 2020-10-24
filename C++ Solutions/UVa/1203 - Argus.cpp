#include <bits/stdc++.h>
using namespace std;

struct Register{
    int id;
    int period;
    Register(int id, float period) : id(id), period(period) {}
};

struct comp {
    bool operator()(Register const& r1, Register const& r2)
    {
        return r1.id > r2.id;
    }
};

int main()
{
    string str;
    int _id, _period,k,t=1;
    vector<Register> R;
    priority_queue<Register, vector<Register>, comp> pq;
    while(cin>>str && str!="#"){
        cin>>_id>>_period;
        R.push_back({_id,_period});
    }
    cin>>k;
    while(k){
        for(int i=0;i<R.size();i++){
            if(t % R[i].period == 0){
                pq.push({R[i].id,R[i].period});
            }
        }
        while(!pq.empty() && k ){
            cout<<pq.top().id<<'\n';
            pq.pop();
            k--;
        }
        t++;
    }
    return 0;
}

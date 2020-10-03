#include <bits/stdc++.h>
using namespace std;

struct gift{
    string name;
    double value;
    int pref;
};

struct comp {
    bool operator()(gift const& a, gift const& b) {
        if(a.pref == b.pref){
            if(a.value == b.value) return a.name > b.name;
            return a.value > b.value;
        }
        return a.pref < b.pref;
    }
};

int main()
{
    //freopen("test.txt","w",stdout);
    string name,o,x;
    double p;
    int q,e;
    while(cin>>name){
        cin>>q;
        priority_queue<gift,vector<gift>,comp> wishes;
        for(int i=0;i<q;i++){
            cin.ignore();
            getline(cin,o);
            cin>>p>>e;
            wishes.push({o,p,e});
        }
        cout<<"Lista de "<<name<<'\n';
        while(!wishes.empty()){
            cout<<wishes.top().name<<" - R$";
            printf("%.2lf\n",wishes.top().value);
            wishes.pop();
        }
        cout<<'\n';
    }
    return 0;
}

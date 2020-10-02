#include <bits/stdc++.h>
using namespace std;

struct triplet{
    int first,second,third;
    //first: to save the arrival minute
    //second: to save the minute they crossed
    //third: to save if they arrived in the left or right bank (1=right|0=left)
};

bool comp(triplet a, triplet b){
    if(a.first==b.first) return (a.third<b.third);
    return (a.first<b.first);
}

int main()
{
    int c,n,t,m,mx;
    cin>>c;
    for(int tc=0;tc<c;tc++){
        cin>>n>>t>>m;
        queue<int> lBank,rBank;     //to keep the minutes the cars arrive
        queue<int> cap;     //ferry capacity, keeps the minute the car arrived
        vector<triplet> arrival;
        string bank;
        int time=0;
        bool flag,ferry=false;
        for(int i=0;i<m;i++){   //Lets save the cars how are arriving
            cin>>mx>>bank;
            if(bank=="left") lBank.push(mx);
            else rBank.push(mx);
        }
        //Ferry mechanics
        while(!lBank.empty() || !rBank.empty()){
            if(ferry){      //if it's on right
                flag=ferry;     //remember the state how ferry arrived
                //loads until it's full or there are no more cars waiting
                for(int i=0;i<n && !rBank.empty() && time>=rBank.front();i++){
                    cap.push(rBank.front());
                    rBank.pop();
                }
                //checks the other bank if there wasn't any load
                if(!lBank.empty() && time>=lBank.front() && cap.size()==0){
                    ferry=false;
                    time+=t;
                }
                //unloads
                if(cap.size()>0){
                    ferry=false;
                    time+=t;
                    int capsize = cap.size();
                    for(int i=0;i<capsize;i++){
                        arrival.push_back({cap.front(),time,1});
                        cap.pop();
                    }
                }
            }else{      //if it's on left
                flag = ferry;
                //loads until it's full or there are no more cars waiting
                for(int i=0;i<n && !lBank.empty() && time>=lBank.front();i++){
                    cap.push(lBank.front());
                    lBank.pop();
                }
                //checks the other bank if there wasn't any load
                if(!rBank.empty() && time>=rBank.front() && cap.size()==0){
                    ferry=true;
                    time+=t;
                }
                //unloads
                if(cap.size()>0){
                    ferry=true;
                    time+=t;
                    int capsize = cap.size();
                    for(int i=0;i<capsize;i++){
                        arrival.push_back({cap.front(),time,0});
                        cap.pop();
                    }
                }
            }
            //if it's true there were no transport in that minute, so it waits the next minute
            if(flag==ferry) time++;
        }
        sort(arrival.begin(),arrival.end(),comp);
        //if they arrived at same min. the ones on the left have priority
        for(int i=0;i<arrival.size();i++){
            cout<<arrival[i].second<<'\n';
        }
        if(c!=1 && tc!=c-1) cout<<'\n';
    }
    return 0;
}

#include <bits/stdc++.h>
using namespace std;
typedef pair<int,int> ii;
int main(){
    int n;
    while(cin>>n){
        ios_base::sync_with_stdio(false); cin.tie(0);
        int h,m,c;
        queue<ii> sc;
        for(int i=0;i<n;i++){
            cin>>h>>m>>c;
            h = (h-7)*60+m;
            sc.push(ii(h,h+c));
        }
        int criticPatients=0,AttendHr=0;
        while(!sc.empty()){
            //Trabajar en este fragmento
            while(sc.front().first>AttendHr) AttendHr+=30;
            if(AttendHr>sc.front().second) criticPatients++;
            AttendHr+=30;
            sc.pop();
        }
        cout<<criticPatients<<'\n';
    }
    return 0;
}

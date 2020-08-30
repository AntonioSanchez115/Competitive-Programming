#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    while(cin>>n){
        vector<int> beatenDays;
        beatenDays.push_back(1);
        float highScore,t,d;
        for(int i=0;i<n;i++){
            cin>>t>>d;
            if(i==0) highScore=d/t;
            else{
                if(d/t>highScore){
                    highScore=d/t;
                    beatenDays.push_back(i+1);
                }
            }
        }
        sort(beatenDays.begin(),beatenDays.end());
        for(int i=0;i<beatenDays.size();i++){
            cout<<beatenDays[i]<<'\n';
        }
    }
    return 0;
}

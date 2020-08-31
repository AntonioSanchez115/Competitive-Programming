#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n,d;
    while(cin>>n>>d){
        string date[d],confirmedDate;
        bool eventHold = false,c;
        for(int i=0;i<d;i++){
            int confirmed = 0;
            cin>>date[i];
            for(int j=0;j<n;j++){
                cin>>c;
                if(c) confirmed++;
            }
            if(confirmed==n && eventHold==false){
                eventHold=true;
                confirmedDate=date[i];
            }

        }
        if(eventHold) cout<<confirmedDate<<'\n';
        else cout<<"Pizza antes de FdI\n";
    }
    return 0;
}

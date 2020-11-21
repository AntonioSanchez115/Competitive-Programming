#include <bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin >> t;
    while(t--){
        int s, hit = 0;
        string seq;
        cin >> s;
        int  shoot[s];
        for(int i=0;i<s;i++) cin >> shoot[i];
        cin >> seq;
        for(int i=0;i<seq.size();i++){
            if(seq[i]=='S'){
                if(shoot[i]<=2) hit++;
            }else{
                if(shoot[i]>2) hit++;
            }
        }
        cout << hit << '\n';
    }
    return 0;
}

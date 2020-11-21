#include <bits/stdc++.h>
using namespace std;
typedef pair<int,string> is;
int main()
{
    int n,x;
    string str;
    while(cin >> n){
        vector<is> piece;
        for(int i=0;i<n;i++){
            cin >> str >> x;
            piece.push_back({x,str});
        }
        sort(piece.begin(),piece.end());
        for(int i=0;i<n;i++){
            if(i==0) cout << piece[0].second;
            else cout << ' ' << piece[i].second;
        }
        cout << '\n';
    }
    return 0;
}

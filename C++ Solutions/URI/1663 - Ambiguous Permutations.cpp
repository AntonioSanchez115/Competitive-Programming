#include <bits/stdc++.h>
using namespace std;

bool compareVec(int vec1[], int vec2[], int n){
    for(int i=0;i<n;i++){
        if(vec1[i] != vec2[i]) return false;
    }
    return true;
}

int main()
{
    int n,x;
    while(cin >> n && n != 0){
        vector<pair <int,int>> vec;
        int vec1[n], vec2[n];
        for(int i=0;i<n;i++){
            cin >> x;
            vec1[i] = x;
            vec.push_back({x,i+1});
        }
        sort(vec.begin(),vec.end());
        for(int i=0;i<n;i++){
            vec2[i] = vec[i].second;
        }
        cout << ((compareVec(vec1,vec2,n) ? "ambiguous\n" : "not ambiguous\n"));
    }
    return 0;
}

#include <bits/stdc++.h>
using namespace std;

string sinuca(int vec[], int s){
    if(s==1){
        if(vec[0]==1) return "preta";
        return "branca";
    }
    int vec1[s-1];
    for(int i=0;i<s-1;i++){
        if(vec[i] == vec[i+1]) vec1[i] = 1;
        else vec1[i] = -1;
    }
    return sinuca(vec1,s-1);
}

int main()
{
    int n;
    cin >> n;
    int vec[n];
    for(int i=0;i<n;i++) cin >> vec[i];
    cout << sinuca(vec,n) << '\n';
    return 0;
}

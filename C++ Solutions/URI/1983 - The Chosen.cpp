#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n,id,idx=-1; cin>>n;
    double note,maxNote=8;
    for(int i=0;i<n;i++){
        cin>>id>>note;
        if(note>=maxNote){
            maxNote=note;
            idx=id;
        }
    }
    if(idx>0) cout<<idx<<'\n';
    else cout<<"Minimum note not reached\n";
    return 0;
}

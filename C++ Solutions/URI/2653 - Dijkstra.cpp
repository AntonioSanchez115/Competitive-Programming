#include <bits/stdc++.h>
using namespace std;

int main()
{
    string j;
    set<string> mySet;
    while(cin>>j){
        mySet.insert(j);
    }
    cout<<mySet.size()<<'\n';
    return 0;
}

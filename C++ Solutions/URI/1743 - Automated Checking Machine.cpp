#include <bits/stdc++.h>
using namespace std;

int main()
{
    bool c = true;
    int vec1[5],vec2[5];
    for(int i=0;i<5;i++) cin>>vec1[i];
    for(int i=0;i<5;i++) cin >> vec2[i];
    for(int i=0;i<5;i++){
        if(vec1[i]==vec2[i]) c = false;
    }
    cout << ((c)?'Y':'N') << '\n';
    return 0;
}

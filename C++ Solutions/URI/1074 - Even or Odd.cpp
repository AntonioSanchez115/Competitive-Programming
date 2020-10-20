#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n,x;
    cin>>n;
    for(int i=0;i<n;i++){
        cin>>x;
        if(!x) cout<<"NULL\n";
        else{
            if(x%2) cout<<"ODD ";
            else cout<<"EVEN ";
            if(x>0) cout<<"POSITIVE\n";
            else cout<<"NEGATIVE\n";
        }
    }
    return 0;
}

#include <bits/stdc++.h>

using namespace std;

int main()
{
    int L,V,hi;
    while(cin>>L && L!=EOF){
        for(int i=0;i<L;i++){
            cin>>V;
            if(i==0) hi=V;
            else{
                if(V>hi) hi=V;
            }
        }
        if(hi<10) cout<<"1\n";
        else if(hi>=10 && hi<20) cout<<"2\n";
        else cout<<"3\n";
    }
    return 0;
}

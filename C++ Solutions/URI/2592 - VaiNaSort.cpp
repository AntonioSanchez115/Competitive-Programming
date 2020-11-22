#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    while(cin >> n && n!=0){
        int ordvec[n], vec[n], att = 0;
        bool order = false;
        while(!order){
            int x;
            for(int i=0;i<n;i++){
                cin >> vec[i];
                ordvec[i] = vec[i];
            }
            sort(ordvec,ordvec+n);
            for(x=0;x<n;x++){
                if(ordvec[x]!=vec[x]) break;
            }
            if(x==n) order = true;
            att++;
        }
        cout << att << '\n';
    }
    return 0;
}

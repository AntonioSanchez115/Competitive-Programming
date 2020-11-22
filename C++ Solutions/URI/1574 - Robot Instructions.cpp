#include <bits/stdc++.h>
using namespace std;

int main()
{
    //200 = left, 300 = right
    int t,n;
    string str;
    cin >> t;
    while(t--){
        int p = 0, x;
        cin >> n;
        int ins[n];
        for(int i=0;i<n;i++){
            cin >> str;
            if(str=="LEFT") ins[i] = 200;
            else if(str=="RIGHT") ins[i] = 300;
            else{
                cin >> str >> x;
                ins[i] = x-1;
            }
        }
        for(int i=0;i<n;i++){
            int ip = ins[i];
            while(ip<=100) ip = ins[ip];
            if(ip==200) p--;
            else p++;
        }
        cout << p << '\n';
    }
    return 0;
}

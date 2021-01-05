#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n,a,b,time = 0;
    cin >> n;
    for(int i=0;i<n;i++){
        if(i==0) cin >> a;
        else{
            cin >> b;
            if(b-a > 9) time += 10;
            else time += b-a;
            a = b;
        }
    }
    time += 10;
    cout << time << '\n';
    return 0;
}

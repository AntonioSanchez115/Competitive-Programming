#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    while(cin >> n && n!=0){
        int vec[n], time = 0;
        for(int i=0;i<n;i++) cin >> vec[i];
        for(int i=0;i<n-1;i++){
            if(vec[i]+10>=vec[i+1]) time += (vec[i+1]-vec[i]);
            else time += 10;
        }
        time += 10;
        cout << time << '\n';
    }
    return 0;
}

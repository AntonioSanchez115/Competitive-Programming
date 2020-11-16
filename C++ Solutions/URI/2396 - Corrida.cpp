#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n,m,x,c,t=3;
    cin >> n >> m;
    int vec[n];
    for(int i=0;i<n;i++){
        int sum = 0;
        for(int j=0;j<m;j++){
            cin >> x;
            sum += x;
        }
        vec[i] = sum;
    }
    while(t--){
        x = INT_MAX;
        for(int i=0;i<n;i++){
            if(vec[i] < x){
                x = vec[i];
                c = i+1;
            }
        }
        cout << c << '\n';
        vec[c-1] = INT_MAX;
    }
    return 0;
}

#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cin >> n;
    int m[n];
    bool b[n];
    for(int i=0;i<n;i++) m[i] = 0;
    for(int i=0;i<n;i++) cin >> b[i];
    for(int i=0;i<n;i++){
        if(i==0){
            if(b[i]) m[i]++;
            if(b[i+1]) m[i]++;
        }else if(i==n-1){
            if(b[i]) m[i]++;
            if(b[i-1]) m[i]++;
        }else{
            if(b[i-1]) m[i]++;
            if(b[i]) m[i]++;
            if(b[i+1]) m[i]++;
        }
    }
    for(int i=0;i<n;i++) cout << m[i] << '\n';
    return 0;
}

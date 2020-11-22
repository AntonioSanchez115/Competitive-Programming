#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n,total = 0,sum = 0,x=0;
    cin >> n;
    int vec[n];
    for(int i=0;i<n;i++){
        cin >> vec[i];
        total += vec[i];
    }
    while(sum!=total/2){
        sum += vec[x++];
    }
    cout << x << '\n';
    return 0;
}

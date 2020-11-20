#include <bits/stdc++.h>
using namespace std;

int main()
{
    int k, n, largest, sum = 0;
    int ans[91];
    string des;
    cin >> k >> des >> n;
    string sheet[n];
    for(int i=0;i<n;i++) cin >> sheet[i];
    for(int i=0;i<k;i++){
        for(int x=0;x<91;x++) ans[x] = 0;
        largest = 0;
        for(int j=0;j<n;j++){
            if(sheet[j][i]!=des[i]) ans[(sheet[j][i]-0)]++;
        }
        for(int x=0;x<91;x++) largest = max(largest, ans[x]);
        sum += largest;
    }
    cout << sum << '\n';
    return 0;
}

#include <bits/stdc++.h>
using namespace std;

int main()
{
    int c = 1, maxCount = 0, n;
    cin >> n;
    int vec[n];
    for(int i=0;i<n;i++) cin >> vec[i];
    for(int i=0;i<n;i++){
        if(vec[i] == vec[i+1]) c++;
        else{
            maxCount = max(c,maxCount);
            c = 1;
        }
    }
    maxCount = max(c,maxCount);
    cout << maxCount << '\n';
    return 0;
}

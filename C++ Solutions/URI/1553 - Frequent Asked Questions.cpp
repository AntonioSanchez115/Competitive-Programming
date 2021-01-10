#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n,k;
    while(cin >> n >> k && n+k != 0){
        int vec[n], maxn = 0, c = 0;
        for(int i=0;i<n;i++){
            cin >> vec[i];
            maxn = max(maxn,vec[i]);
        }
        int nums[maxn];
        for(int i=0;i<maxn;i++) nums[i] = 0;
        for(int i=0;i<n;i++) nums[vec[i]-1]++;
        for(int i=0;i<maxn;i++) if(nums[i] >= k) c++;
        cout << c << '\n';
    }
    return 0;
}

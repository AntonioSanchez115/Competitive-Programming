#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n, i = 0, sum = 0, k = 0, fact[8] = {40320,5040,720,120,24,6,2,1};
    cin >> n;
    while(sum<n){
        while(fact[i]+sum<=n){
            sum += fact[i];
            k++;
        }
        i++;
    }
    cout << k << '\n';
    return 0;
}

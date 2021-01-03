#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n,I,F,c=0;
    cin >> n >> I >> F;
    int vec[n];
    for(int i=0;i<n;i++) cin >> vec[i];
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(vec[i] + vec[j] >= I && vec[i] + vec[j] <= F) c++;
        }
    }
    cout << c << '\n';
    return 0;
}

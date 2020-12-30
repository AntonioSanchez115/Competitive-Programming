#include <bits/stdc++.h>
using namespace std;

int main()
{
    int vec[3];
    for(int i=0;i<3;i++) cin >> vec[i];
    sort(vec,vec+3);
    cout << vec[1] << '\n';
    return 0;
}

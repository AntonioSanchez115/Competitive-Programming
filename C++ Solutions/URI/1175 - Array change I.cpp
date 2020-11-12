#include <bits/stdc++.h>
using namespace std;

int main()
{
    int vec[20];
    for(int i=0;i<20;i++) cin >> vec[i];
    for(int i=0;i<20;i++) cout << "N[" << i << "] = " << vec[19-i] << '\n';
    return 0;
}

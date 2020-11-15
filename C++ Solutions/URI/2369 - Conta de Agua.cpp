#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n, amount = 7;
    cin >> n;
    if(n>10 && n<=30) amount = 7 + (n-10);
    if(n>30 && n<=100) amount = 27 + (n-30)*2;
    if(n>100) amount = 167 + (n-100)*5;
    cout << amount << '\n';
    return 0;
}

#include <bits/stdc++.h>
using namespace std;

int main()
{
    int k;
    cin >> k;
    cout << "Top ";
    if(k<=1) cout << "1\n";
    else if(k<=3) cout << "3\n";
    else if(k<=5) cout << "5\n";
    else if(k<=10) cout << "10\n";
    else if(k<=25) cout << "25\n";
    else if(k<=50) cout << "50\n";
    else cout << "100\n";
    return 0;
}

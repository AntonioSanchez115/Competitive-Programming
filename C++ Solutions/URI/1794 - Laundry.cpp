#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n,la,lb,sa,sb;
    cin >> n >> la >> lb >> sa >> sb;
    cout << (((n>=la && n<=lb) && (n>=sa && n<=sb)) ? "possivel\n" : "impossivel\n");
    return 0;
}

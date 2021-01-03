#include <bits/stdc++.h>
using namespace std;

int main()
{
    int x,y;
    while(cin >> x >> y){
        int x1 = x, y1 = y, c = 1;
        while(y1 - x1 < y){
            x1 += x;
            y1 += y;
            c++;
        }
        cout << c << '\n';
    }
    return 0;
}

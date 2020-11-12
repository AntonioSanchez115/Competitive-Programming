#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cin>>n;
    while(n--){
        int x,y,sum=0;
        cin >> x >> y;
        while(y){
            if(x%2){
                sum += x;
                y--;
            }
            x++;
        }
        cout << sum << '\n';
    }
    return 0;
}

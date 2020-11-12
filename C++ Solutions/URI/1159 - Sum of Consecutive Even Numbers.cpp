#include <bits/stdc++.h>
using namespace std;

int main()
{
    int x,y=5,sum=0;
    while(cin >> x && x){
        while(y){
            if(x%2==0){
                sum+=x;
                y--;
            }
            x++;
        }
        cout << sum << '\n';
        sum=0,y=5;
    }

    return 0;
}

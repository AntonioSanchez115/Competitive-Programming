#include <bits/stdc++.h>
using namespace std;

int main()
{
    int t,a,b,r;
    char c,cx;
    cin >> t;
    while(t--){
        cin >> a >> c >> b >> cx >> r;
        cout << "E";
        if(c=='+'){
            for(int i=0;i<(abs(r-(a+b)));i++) cout << 'r';
        }else if(c=='x'){
            for(int i=0;i<(abs(r-(a*b)));i++) cout << 'r';
        }else{
            for(int i=0;i<(abs(r-(a-b)));i++) cout << 'r';
        }
        cout << "ou!\n";
    }
    return 0;
}

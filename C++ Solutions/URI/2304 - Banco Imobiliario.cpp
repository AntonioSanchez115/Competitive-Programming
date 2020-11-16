#include <bits/stdc++.h>
using namespace std;

int main()
{
    int I,n,D,E,F,x;
    char c,c1,c2;
    cin >> I >> n;
    D = I, E = I, F = I;
    for(int i=0;i<n;i++){
        cin >> c >> c1;
        if(c == 'C'){
            cin >> x;
            if(c1 == 'D') D-=x;
            if(c1 == 'E') E-=x;
            if(c1 == 'F') F-=x;
        }else if(c == 'V'){
            cin >> x;
            if(c1 == 'D') D+=x;
            if(c1 == 'E') E+=x;
            if(c1 == 'F') F+=x;
        }else{//A
            cin >> c2 >> x;
            if(c1 == 'D'){
                if(c2 == 'E') D+=x, E-=x;
                if(c2 == 'F') D+=x, F-=x;
            }else if(c1 == 'E'){
                if(c2 == 'D') E+=x, D-=x;
                if(c2 == 'F') E+=x, F-=x;
            }else{
                if(c2 == 'D') F+=x, D-=x;
                if(c2 == 'E') F+=x, E-=x;
            }
        }
    }
    cout << D << ' ' << E << ' ' << F << '\n';
    return 0;
}

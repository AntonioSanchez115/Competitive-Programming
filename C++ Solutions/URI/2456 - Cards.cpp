#include <bits/stdc++.h>
using namespace std;

int main()
{
    int x1,x2;
    bool C=true, D=true;
    for(int i=0;i<5;i++){
        if(i==0) cin >> x1;
        else{
            cin >> x2;
            if(x2 < x1) C=false;
            else D=false;
            x1 = x2;
        }
    }
    if(C) cout << "C\n";
    else if(D) cout << "D\n";
    else cout <<"N\n";
    return 0;
}

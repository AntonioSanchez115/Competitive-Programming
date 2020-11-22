#include <bits/stdc++.h>
using namespace std;

int main()
{
    int a[6], c=0, x;
    for(int i=0;i<6;i++) cin >> a[i];
    for(int i=0;i<6;i++){
        cin >> x;
        for(int j=0;j<6;j++) if(x==a[j]) c++;
    }
    if(c==3) cout << "terno\n";
    else if(c==4) cout << "quadra\n";
    else if(c==5) cout << "quina\n";
    else if(c==6) cout << "sena\n";
    else cout << "azar\n";
    return 0;
}

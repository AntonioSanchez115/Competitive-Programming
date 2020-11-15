#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n,p,t=1,winner;
    while(cin >> n && n!=0){
        for(int i=0;i<n;i++){
            cin >> p;
            if(p==i+1) winner = p;
        }
        cout << "Teste " << t++ << '\n' << winner << "\n\n";
    }
    return 0;
}

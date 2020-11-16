#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cin >> n;
    int card[n], pile=n;
    for(int i=0;i<n;i++) cin >> card[i];
    int i=n-1;
    while(i>0){
        int cont=0;
        while(i!=0 && card[i-1] >= card[i]){
            cont++;
            i--;
        }
        i--;
        pile-=cont;
    }
    cout << pile << '\n';
    return 0;
}

#include <bits/stdc++.h>
using namespace std;

int main()
{
    int x,y;
    while(cin>>x>>y && x!=y){
        cout<<((x>y) ? "Decrescente\n" : "Crescente\n");
    }
    return 0;
}

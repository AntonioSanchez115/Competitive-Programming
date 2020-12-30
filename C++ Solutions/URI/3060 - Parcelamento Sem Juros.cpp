#include <bits/stdc++.h>
using namespace std;

int main()
{
    int v,p;
    cin >> v >> p;
    if(v%p==0) for(int i=0;i<p;i++) cout << v/p << '\n';
    else{
        for(int i=0;i<(v%p);i++) cout << ceil((double)v/(double)p) << '\n';
        for(int i=0;i<p-(v%p);i++) cout << floor((double)v/(double)p) << '\n';
    }
    return 0;
}

#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n,x=1;
    cin>>n;
    for(int i=0;i<n;i++){
        for(int j=0;j<3;j++){
            cout<<x++<<' ';
        }
        x++;
        cout<<"PUM\n";
    }
    return 0;
}

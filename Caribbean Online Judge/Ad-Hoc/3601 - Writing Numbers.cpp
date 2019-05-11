#include <bits/stdc++.h>
using namespace std;

int main()
{
    string vec[12]={"one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve"};
    int k,i;
    cin>>k;
    while(k--){
        cin>>i;
        cout<<vec[i-1]<<'\n';
    }
    return 0;
}

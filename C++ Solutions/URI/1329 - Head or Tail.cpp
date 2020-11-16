#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n,j,m;
    bool x;
    while(cin >> n && n != 0){
        j=0,m=0;
        for(int i=0;i<n;i++){
            cin >> x;
            if(x) j++;
            else m++;
        }
        cout << "Mary won " << m << " times and John won " << j << " times\n";
    }
    return 0;
}

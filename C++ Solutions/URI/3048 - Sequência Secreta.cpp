#include <bits/stdc++.h>
using namespace std;

int main()
{
    bool one=true,two=false;
    int n,x,m=1;
    cin >> n;
    for(int i=0;i<n;i++){
        cin >> x;
        if(one){
            if(x==2){
                m++;
                one = false;
                two = true;
            }
        }else{
            if(x==1){
                m++;
                one = true;
                two = false;
            }
        }
    }
    cout << m << '\n';
    return 0;
}

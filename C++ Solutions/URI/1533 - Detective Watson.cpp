#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    while(cin >> n && n!=0){
        int susp[n], M=0, index=-1;
        for(int i=0;i<n;i++) cin >> susp[i];
        for(int i=0;i<n;i++){
            if(susp[i]>M){
                M = susp[i];
                index = i;
            }
        }
        for(int i=0;i<n;i++) if(i==index) susp[i] = 0;
        M=0, index=-1;
        for(int i=0;i<n;i++){
            if(susp[i]>M){
                M = susp[i];
                index = i;
            }
        }
        cout << index+1 << '\n';
    }
    return 0;
}

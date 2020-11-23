#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    while(cin >> n && n!=0){
        int wave[n], p = 0;
        for(int i=0;i<n;i++) cin >> wave[i];
        bool dir = ((wave[0]>wave[1]) ? false : true);
        if(dir){
            if(wave[n-1]>wave[0]) p++;
        }else{
            if(wave[n-1]<wave[0]) p++;
        }
        for(int i=0;i<n-1;i++){
            if(dir){
                if(wave[i]>wave[i+1]){
                    p++;
                    dir = false;
                }
            }else{
                if(wave[i]<wave[i+1]){
                    p++;
                    dir = true;
                }
            }
        }
        if(dir){
            if(wave[n-1]>wave[0]) p++;
        }else{
            if(wave[n-1]<wave[0]) p++;
        }
        cout << p << '\n';
    }
    return 0;
}

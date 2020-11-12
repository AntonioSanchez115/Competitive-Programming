#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n, par[5], impar[5], i=0, p=0;
    for(int x=0;x<15;x++){
        cin >> n;
        if(n%2){
            impar[i++] = n;
            if(i==5){
                for(int z=0;z<5;z++){
                    cout << "impar[" << z << "] = " << impar[z] << '\n';
                    impar[z] = 0;
                }
                i=0;
            }
        }else{
            par[p++] = n;
            if(p==5){
                for(int y=0;y<5;y++){
                    cout << "par[" << y << "] = " << par[y] << '\n';
                    par[y] = 0;
                }
                p=0;
            }
        }
    }
    for(int z=0;z<i;z++) cout << "impar[" << z << "] = " << impar[z] << '\n';
    for(int y=0;y<p;y++) cout << "par[" << y << "] = " << par[y] << '\n';
    return 0;
}

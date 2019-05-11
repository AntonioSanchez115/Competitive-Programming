#include <bits/stdc++.h>
using namespace std;

int main(){
    int t,n;
    cin>>t;
    string vec[20]={"un","deux","trois","quatre","cinq","six","sept","huit","neuf","dix","onze","douze","treize","quatorze","quinze","seize","dix-sept","dix-huit","dix-neuf","vingt"};
    while(t--){
        cin>>n;
        cout<<vec[n-1]<<'\n';
    }
    return 0;
}

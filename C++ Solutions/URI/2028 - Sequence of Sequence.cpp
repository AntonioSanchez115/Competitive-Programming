#include <bits/stdc++.h>

using namespace std;

int main()
{
    int t=1,n;
    while(cin>>n){
        int s=1;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++) s++;
        }
        cout<<"Caso "<<t<<": "<<s<<" ";
        cout<<((s==1)?"numero\n":"numeros\n");
        cout<<0;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                cout<<' '<<i;
            }
        }
        cout<<"\n\n";
        t++;
    }
    return 0;
}

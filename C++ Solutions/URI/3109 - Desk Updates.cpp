#include <iostream>

using namespace std;

int main()
{
    int n,q,e,a,b,x,y,aux;
    cin >> n >> q;
    int E[n+1];
    for(int i=1;i<=n;i++) E[i] = i;
    for(int i=0;i<q;i++){
        cin >> e;
        if(e==1){
            cin >> a >> b;
            for(int j=1;j<=n;j++) if(E[j]==a) x = j;
            for(int j=1;j<=n;j++) if(E[j]==b) y = j;
            aux = E[x];
            E[x] = E[y];
            E[y] = aux;
        }else{
            cin >> a;
            int cont = 0, j = a;
            while(E[j]!=a){
                j = E[j];
                cont++;
            }
            cout << cont << '\n';
        }
    }
    return 0;
}

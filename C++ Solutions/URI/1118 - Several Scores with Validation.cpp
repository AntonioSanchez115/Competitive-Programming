#include <bits/stdc++.h>
using namespace std;

int main()
{
    double x,sum,c,nc=1;
    while(nc!=2){
        if(nc==1){
            sum = 0, c = 0;
            while(c<2){
                cin>>x;
                if(x>=0 && x<=10.0){
                    sum += x;
                    c++;
                }else{
                    cout<<"nota invalida\n";
                }
            }
            printf("media = %.2lf\n",sum/2.0);
        }
        cout<<"novo calculo (1-sim 2-nao)\n";
        cin>>nc;
    }
    return 0;
}

#include <bits/stdc++.h>
using namespace std;

int main()
{
    double p=0,c=0,x;
    while(c<2 && cin>>x){
        if(x>=0.0 && x<=10.0){
            p+=x;
            c++;
        }else cout<<"nota invalida\n";
    }
    printf("media = %.2lf\n",p/2.0);
    return 0;
}

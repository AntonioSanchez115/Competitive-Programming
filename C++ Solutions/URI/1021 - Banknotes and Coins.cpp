#include <bits/stdc++.h>
using namespace std;

int main()
{
    double N;
    int nm[12] = {10000,5000,2000,1000,500,200,100,50,25,10,5,1};
    int num[12] = {0};
    long long int n;
    cin>>N;
    n = N * 100.0 + 0.000001;
    for(int i=0;i<12;i++){
        while(n >= nm[i]){
            num[i]++;
            n = n - nm[i];
        }
    }
    cout<<"NOTAS:\n";
    for(int i=0;i<6;i++) printf("%d nota(s) de R$ %.2lf\n",num[i],((double)(nm[i])/100.0));
    cout<<"MOEDAS:\n";
    for(int i=6;i<12;i++) printf("%d moeda(s) de R$ %.2lf\n",num[i],((double)(nm[i])/100.0));
    return 0;
}

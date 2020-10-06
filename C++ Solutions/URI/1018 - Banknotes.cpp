#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n,n1;
    int notes[7] = {100,50,20,10,5,2,1}, num[7] = {0};
    cin>>n;
    n1 = n;
    for(int i=0;i<7;i++){
        while(n1 >= notes[i]){
            num[i]++;
            n1 -= notes[i];
        }
    }
    cout<<n<<'\n';
    for(int i=0;i<7;i++) printf("%d nota(s) de R$ %d,00\n",num[i],notes[i]);
    return 0;
}

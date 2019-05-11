#include <bits/stdc++.h>
using namespace std;

int main(){
    int n;
    double m,L,C;
    cin>>n;
    for(int i=0;i<n;i++){
        cin>>L>>C;
        if(i==0) m=(L*0.7+C*0.3);
        else m=max(m,(L*0.7+C*0.3));
    }
    printf("%.2f\n",m);
    return 0;
}

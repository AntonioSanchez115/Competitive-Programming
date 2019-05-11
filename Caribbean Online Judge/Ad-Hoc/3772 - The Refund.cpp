#include <bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        double sum=0;
        for(int i=0;i<10;i++){
            cin>>n;
            sum+=(n*85/100.0);
        }
        printf("%.3f\n",sum);
    }
    return 0;
}

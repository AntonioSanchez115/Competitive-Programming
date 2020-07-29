#include <bits/stdc++.h>

using namespace std;

int main()
{
    int p,n;
    bool win=true;
    cin>>p>>n
    int pipes[n];
    for(int i=0;i<n;i++) cin>>pipes[i];
    for(int i=0;i<n-1;i++){
        if(pipes[i]+p < pipes[i+1] || pipes[i]-pipes[i+1] > p){
            win=false;
            break;
        }
    }
    cout<<((win) ? "YOU WIN\n" : "GAME OVER\n");
    return 0;
}

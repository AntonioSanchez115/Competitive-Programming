#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n,atk=0;
    long long int nstoled=0;
    cin>>n;
    int star[n];
    bool stoled[n];
    for(int i=0;i<n;i++) stoled[i] = false;
    for(int i=0;i<n;i++) cin>>star[i];
    int j=0;
    while(true){
        if(stoled[j]==false) stoled[j]=true;
        if((star[j])%2 == 0){
            star[j]--;
            j--;
            if(j<0 || star[j]==0) break;
        }else{
            star[j]--;
            j++;
            if(j==n || star[j]==0) break;
        }
    }
    for(int i=0;i<n;i++){
        if(stoled[i]) atk++;
        nstoled+=star[i];
    }
    cout<<atk<<' '<<nstoled<<'\n';
    return 0;
}

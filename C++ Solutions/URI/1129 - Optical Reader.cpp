#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n;
    while(cin>>n && n!=0){
        for(int i=0;i<n;i++){
            int ans,num=0,sq;
            for(int j=0;j<5;j++){
                cin>>sq;
                if(sq<=127){
                    num++;
                    ans=j;
                }
            }
            if(num==0 || num>1) cout<<"*\n";
            else{
                switch(ans){
                case 0:
                    cout<<"A\n";
                    break;
                case 1:
                    cout<<"B\n";
                    break;
                case 2:
                    cout<<"C\n";
                    break;
                case 3:
                    cout<<"D\n";
                    break;
                case 4:
                    cout<<"E\n";
                    break;
                }
            }
        }
    }
    return 0;
}

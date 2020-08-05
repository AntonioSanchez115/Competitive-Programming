#include <bits/stdc++.h>

using namespace std;

int main()
{
    int t;
    while(cin>>t && t!=0){
        int c=0;
        for(int i=0;i<t;i++){
            int n;
            string food;
            cin>>n;
            getline(cin,food);
            if(food==" suco de laranja") c+=(n*120);
            if(food==" morango fresco" || food==" mamao") c+=(n*85);
            if(food==" goiaba vermelha") c+=(n*70);
            if(food==" manga") c+=(n*56);
            if(food==" laranja") c+=(n*50);
            if(food==" brocolis") c+=(n*34);
        }
        if(c<110) cout<<"Mais "<<(110-c)<<" mg\n";
        else if(c>130) cout<<"Menos "<<(c-130)<<" mg\n";
        else cout<<c<<" mg\n";
    }
    return 0;
}

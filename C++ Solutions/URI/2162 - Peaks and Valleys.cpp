#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n,p,a; cin>>n;
    bool type,patt=true,flag;
    for(int i=0;i<n;i++){
        cin>>a;
        if(i==0) p=a;
        else{
            if(i==1){
                if((p-a)<0){
                    type=false;
                    flag=false;
                }else{
                    type=true;
                    flag=true;
                }
            }
            if(type){//peak
                if(flag){
                    if(p<=a){
                        patt=false;
                        break;
                    }else if(p>=a){
                        flag=false;
                        p=a;
                    }
                }else{
                    if(p>=a){
                        patt=false;
                        break;
                    }else if(p<a){
                        flag=true;
                        p=a;
                    }
                }
            }else{//valley
                if(flag){
                    if(p<=a){
                        patt=false;
                        break;
                    }else{
                        flag=false;
                        p=a;
                    }
                }else{
                    if(p>=a){
                        patt=false;
                        break;
                    }else{
                        flag=true;
                        p=a;
                    }
                }
            }
        }
    }
    cout<<((patt)?"1\n":"0\n");
    return 0;
}

#include <bits/stdc++.h>
using namespace std;

int main()
{
    int hi,hf,mi,mf,h,m;
    cin>>hi>>mi>>hf>>mf;
    if(hi==hf){
        if(mi==mf){
            h=24;
            m=0;
        }else if(mi<mf){
            h=0;
            m=mf-mi;
        }else{
            h=23;
            m=60-mi+mf;
        }
    }else if(hi<hf){
        if(mi==mf){
            h=hf-hi;
            m=0;
        }else if(mi<mf){
            h=hf-hi;
            m=mf-mi;
        }else{
            h=hf-hi-1;
            m=60-mi+mf;
        }
    }else{//(hi>hf)
        if(mi==mf){
            h=24-hi+hf;
            m=0;
        }else if(mi<mf){
            h=24-hi+mf;
            m=mf-mi;
        }else{
            h=24-hi+hf-1;
            m=60-mi+mf;
        }
    }
    cout<<"O JOGO DUROU "<<h<<" HORA(S) E "<<m<<" MINUTO(S)\n";
    return 0;
}

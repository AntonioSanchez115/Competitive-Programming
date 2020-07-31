#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n,m;
    while(cin>>n>>m){
        if(n==0 && m==0) break;
        int c=m-n,p=0,b=0;
        while(p<=c && p+100<=c){
            p+=100;
            b++;
        }
        while(p<=c && p+50<=c){
            p+=50;
            b++;
        }
        while(p<=c && p+20<=c){
            p+=20;
            b++;
        }
        while(p<=c && p+10<=c){
            p+=10;
            b++;
        }
        while(p<=c && p+5<=c){
            p+=5;
            b++;
        }
        while(p<=c && p+2<=c){
            p+=2;
            b++;
        }
        cout<<((p==c && b==2)?"possible\n":"impossible\n");
    }
    return 0;
}

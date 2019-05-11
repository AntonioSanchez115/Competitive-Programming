#include <bits/stdc++.h>
using namespace std;

int main(){
    int n,i=0,g1=0,g2=0,g3=0;
    string str;
    cin>>n>>str;
    char vec1[(int)(n/3)+1];
    char vec2[(int)(n/3)+1];
    char vec3[n-(2*((int)(n/3)+1))];
    while(i<(int)(n/3)+1){
        if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u') g1++;
        i++;
    }
    while(i<2*((int)(n/3)+1)){
        if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u') g2++;
        i++;
    }
    while(i<n){
       if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u') g3++;
        i++;
    }
    cout<<g1<<' '<<g2<<' '<<g3<<'\n';
    return 0;
}

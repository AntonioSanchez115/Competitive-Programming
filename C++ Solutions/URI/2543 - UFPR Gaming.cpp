#include <bits/stdc++.h>

using namespace std;

int main()
{
    int N,I;
    while(cin>>N>>I){
        int v=0;
        for(int i=0;i<N;i++){
            int id,j;
            cin>>id>>j;
            if(id==I && j==0) v++;
        }
        cout<<v<<'\n';
    }
    return 0;
}

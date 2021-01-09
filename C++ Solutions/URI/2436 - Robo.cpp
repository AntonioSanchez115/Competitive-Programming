#include <bits/stdc++.h>
using namespace std;

int main()
{
    int n,m,a,b;
    cin >> n >> m >> a >> b;
    int M[n][m], x = a-1, y = b-1, px = a-1, py = b-1, c = 2;
    bool mosaic = true;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++) cin >> M[i][j];
    }
    while(mosaic){
        if(x!=0 && M[x-1][y] == 1 && x-1!=px){//up
            px = x, py = y;
            x--;
        }
        else if(y!=m-1 && M[x][y+1] == 1 && y+1!=py){//right
            px = x, py = y;
            y++;
        }
        else if(x!=n-1 && M[x+1][y] == 1 && x+1!=px){//down
            px = x, py = y;
            x++;
        }
        else if(y!=0 && M[x][y-1] == 1 && y-1!=py){//left
            px = x, py = y;
            y--;
        }else{
            mosaic = false;
        }
    }
    cout << x+1 << ' ' << y+1 << '\n';
    return 0;
}

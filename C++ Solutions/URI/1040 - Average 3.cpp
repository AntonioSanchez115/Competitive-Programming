#include <bits/stdc++.h>
using namespace std;

int main()
{
    double n1,n2,n3,n4,n5,media;
    cin>>n1>>n2>>n3>>n4;
    media = (n1*2 + n2*3 + n3*4 + n4)/10.0;
    printf("Media: %.1lf\n",media);
    if(media >= 7.0) cout<<"Aluno aprovado.\n";
    else if(media < 5.0) cout<<"Aluno reprovado.\n";
    else{
        cout<<"Aluno em exame.\n";
        cin>>n5;
        printf("Nota do exame: %.1lf\n",n5);
        media = (media + n5) / 2.0;
        if(media >= 5.0) cout<<"Aluno aprovado.\n";
        else cout<<"Aluno reprovado.\n";
        printf("Media final: %.1lf\n",media);
    }
    return 0;
}

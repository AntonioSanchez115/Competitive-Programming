#include <stdio.h>
#include <stdlib.h>
#include <math.h>//We will need this library for funtion log10()

struct player{

    char name[30];
    int PA;
    int PJ;
    int G;
    int A;
    int TA;
    int TR;

}player[100];//Here is where we are going to save the statistics players

int determFactor(int PA,int PJ,int G,int A,int TA,int TR){//This funtion determines the score of each player
    int factor=log10(PA)+PJ+(2*G)+A-(TA+(2*TR));
    return factor;
}
int main()
{
    int i,N,winner=0,highScore;
    scanf("%d",&N);
    for(i=0;i<N;i++){
        fflush(stdin);//To empty the buffer on each iteration
        scanf("%s",&player[i].name);
        scanf("%d",&player[i].PA);
        scanf("%d",&player[i].PJ);
        scanf("%d",&player[i].G);
        scanf("%d",&player[i].A);
        scanf("%d",&player[i].TA);
        scanf("%d",&player[i].TR);
    }

    for(i=0;i<N;i++){//if the score of the player is higher than the highScore...
        if(determFactor(player[i].PA,player[i].PJ,player[i].G,player[i].A,player[i].TA,player[i].TR)>highScore){
            highScore=determFactor(player[i].PA,player[i].PJ,player[i].G,player[i].A,player[i].TA,player[i].TR);
            winner=i;//highScore will be the actual player score and winner will keep the position for the name
        }
    }
    printf("%s",player[winner].name);
    return 0;
}

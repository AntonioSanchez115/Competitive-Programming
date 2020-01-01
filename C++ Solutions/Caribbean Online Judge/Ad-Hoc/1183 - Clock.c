#include <stdio.h>
#include <string.h>
#include <stdbool.h>

char H1[5][3];//      H1 H2 : M1 M2
char H2[5][3];
char M1[5][3];
char M2[5][3];
char V[4];//auxiliary vector for temporary save each group of three chars

char N0[5][3]={"###","#.#","#.#","#.#","###"};
char N1[5][3]={"..#","..#","..#","..#","..#"};
char N2[5][3]={"###","..#","###","#..","###"};
char N3[5][3]={"###","..#","###","..#","###"};
char N4[5][3]={"#.#","#.#","###","..#","..#"};
char N5[5][3]={"###","#..","###","..#","###"};
char N6[5][3]={"###","#..","###","#.#","###"};
char N7[5][3]={"###","..#","..#","..#","..#"};
char N8[5][3]={"###","#.#","###","#.#","###"};
char N9[5][3]={"###","#.#","###","..#","###"};

bool det(char time[5][3], char num[5][3]){//This function verifies if a given matrix
    int i,j;                              //matches another matrix of a specified number
    for(i=0;i<5;i++){
        for(j=0;j<3;j++){
            if(time[i][j]=='#'){//if there is a '#' in the given matrix it will check in the
                if(num[i][j]!='#'){//same position of the number matrix looking for another '#'
                    return false;  //if the char in the position is not a '#' then de given matrix
                }                  //cannot be the number of the matrix
            }
        }
    }
    return true;//If this process ends and there was no problem
}               //then the given matrix is the number matrix

int main()
{
    int tc,h,i,j,k,flag=0;//Variables
    scanf("%d",&tc);//Test cases
    for(h=1;h<=tc;h++){

        for(i=0;i<5;i++){//Each case is scanning through 4 groups of three chars
                scanf("%s",V);//In this code there are 4 matrix of 5x3 representing each digit
                for(k=0;k<3;k++){//of the faulty clock
                    H1[i][k]=V[k];
                }
                scanf("%s",V);//It scans a group of three chars and then are assigned to each row
                for(k=0;k<3;k++){//of the corresponded matrix
                    H2[i][k]=V[k];
                }
                scanf("%s",V);//This process is repeated for each matrix
                for(k=0;k<3;k++){
                    M1[i][k]=V[k];
                }
                scanf("%s",V);
                for(k=0;k<3;k++){
                    M2[i][k]=V[k];
                }
        }

        //Determ. H1:
        if(det(H1,N0)!=true){//if the function yields false
            if(det(H1,N1)!=true){//then it will check with the next number
                printf("2");//from the lower to the higher
            }else{
                printf("1");
            }
        }else{
            printf("0");
        }

        //Determ. H2:
        if(det(H2,N0)!=true){
            if(det(H2,N1)!=true){
                if(det(H2,N2)!=true){
                    if(det(H2,N3)!=true){
                        if(det(H2,N4)!=true){
                            if(det(H2,N5)!=true){
                                if(det(H2,N6)!=true){
                                    if(det(H2,N7)!=true){
                                        if(det(H2,N8)!=true){
                                            printf("9");
                                        }else{
                                            printf("8");
                                        }
                                    }else{
                                        printf("7");
                                    }
                                }else{
                                    printf("6");
                                }
                            }else{
                                printf("5");
                            }
                        }else{
                            printf("4");
                        }
                    }else{
                        printf("3");
                    }
                }else{
                    printf("2");
                }
            }else{
                printf("1");
            }
        }else{
            printf("0");
        }

        printf(":");

        //Determ. M1:
        if(det(M1,N0)!=true){
            if(det(M1,N1)!=true){
                if(det(M1,N2)!=true){
                    if(det(M1,N3)!=true){
                        if(det(M1,N4)!=true){
                            printf("5");
                        }else{
                            printf("4");
                        }
                    }else{
                        printf("3");
                    }
                }else{
                    printf("2");
                }
            }else{
                printf("1");
            }
        }else{
            printf("0");
        }

        //Determ. M2:
        if(det(M2,N0)!=true){
            if(det(M2,N1)!=true){
                if(det(M2,N2)!=true){
                    if(det(M2,N3)!=true){
                        if(det(M2,N4)!=true){
                            if(det(M2,N5)!=true){
                                if(det(M2,N6)!=true){
                                    if(det(M2,N7)!=true){
                                        if(det(M2,N8)!=true){
                                            printf("9\n");
                                        }else{
                                            printf("8\n");
                                        }
                                    }else{
                                        printf("7\n");
                                    }
                                }else{
                                    printf("6\n");
                                }
                            }else{
                                printf("5\n");
                            }
                        }else{
                            printf("4\n");
                        }
                    }else{
                        printf("3\n");
                    }
                }else{
                    printf("2\n");
                }
            }else{
                printf("1\n");
            }
        }else{
            printf("0\n");
        }
    }
    return 0;
}

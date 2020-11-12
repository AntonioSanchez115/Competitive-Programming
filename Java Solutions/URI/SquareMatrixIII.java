
import java.io.*;

public class SquareMatrixIII {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int e,x,y,n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            long[][] m = new long[n][n];
            for(int i=0;i<(2*n)-1;i++){
                e = (int) Math.pow(2,i);
                if(i<n){
                    x = i;
                    y = 0;
                    for(int j=0;j<i+1;j++) m[x--][y++] = e;
                }else{
                    x = n - 1;
                    y = n - ((2*n-1)-(i%(2*n-1)));
                    for(int j=(2*n-1)-(i%(2*n-1));j>0;j--) m[x--][y++] = e;
                }
            }
            for(int i = 0;i < n;i++){
                for(int j = 0;j < n;j++){
                    if(n==3 || n==4){
                           if(j==0) System.out.printf("%2d",m[i][j]);
                           else System.out.printf(" %2d",m[i][j]);
                    }
                    else if(n==5){
                           if(j==0) System.out.printf("%3d",m[i][j]);
                           else System.out.printf(" %3d",m[i][j]);
                    }
                    else if(n==6 || n==7){
                           if(j==0) System.out.printf("%4d",m[i][j]);
                           else System.out.printf(" %4d",m[i][j]);
                    }
                    else if(n==8 || n==9){
                           if(j==0) System.out.printf("%5d",m[i][j]);
                           else System.out.printf(" %5d",m[i][j]);
                    }
                    else if(n==10){
                           if(j==0) System.out.printf("%6d",m[i][j]);
                           else System.out.printf(" %6d",m[i][j]);
                    }
                    else if(n==11 || n==12){
                           if(j==0) System.out.printf("%7d",m[i][j]);
                           else System.out.printf(" %7d",m[i][j]);
                    }
                    else if(n==13 || n==14){
                           if(j==0) System.out.printf("%8d",m[i][j]);
                           else System.out.printf(" %8d",m[i][j]);
                    }
                    else if(n==15){
                           if(j==0) System.out.printf("%9d",m[i][j]);
                           else System.out.printf(" %9d",m[i][j]);
                    }
                    else if(n==1)System.out.printf("%1d",m[i][j]);
                    else if(n==2){
                        if(j==0)System.out.printf("%d",m[i][j]);
                        else System.out.printf(" %d",m[i][j]);
                    }
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }

}

import java.io.*;

public class SquareSpiral {

    static char M[][] = new char[25][25];

    static void printM(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(M[i][j]);
            };
            System.out.println("");
        }
        System.out.println("@");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, x, y, maxLimit, minLimit;
        Boolean right, up, left, down;
        while (true) {
            n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            right = true;
            up = false;
            left = false;
            down = false;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    M[i][j] = 'O';
                }
            }
            x = n / 2;
            y = n / 2;
            maxLimit = x + 1;
            minLimit = y - 1;
            M[x][y] = 'X';
            while (M[n - 1][n - 1] != 'X') {
                if (x == maxLimit && y == minLimit) {
                    maxLimit++;
                    minLimit--;
                }
                printM(n);
                M[x][y] = 'O';
                if (right) {
                    y++;
                    M[x][y] = 'X';
                    if (y == maxLimit) {
                        right = false;
                        up = true;
                        continue;
                    }
                }
                if (up) {
                    x--;
                    M[x][y] = 'X';
                    if (x == minLimit) {
                        up = false;
                        left = true;
                        continue;
                    }
                }
                if (left) {
                    y--;
                    M[x][y] = 'X';
                    if (y == minLimit) {
                        left = false;
                        down = true;
                        continue;
                    }
                }
                if (down) {
                    x++;
                    M[x][y] = 'X';
                    if (x == maxLimit) {
                        down = false;
                        right = true;
                        continue;
                    }
                }
            }
            printM(n);
        }
    }

}

import java.io.*;
import java.util.Vector;

public class PacMan {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cont = 0, maxfood = 0, n = Integer.parseInt(br.readLine());
        String str;
        char board[][] = new char[n][n];
        Vector<Integer> food = new Vector<Integer>();
        for (int i = 0; i < n; i++) {
            str = br.readLine();
            for (int j = 0; j < n; j++) {
                board[i][j] = str.charAt(j);
            }
        }
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    if (board[i][j] == 'o') {
                        cont++;
                    }
                    if (board[i][j] == 'A') {
                        food.add(cont);
                        cont = 0;
                    }
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    if (board[i][j] == 'o') {
                        cont++;
                    }
                    if (board[i][j] == 'A') {
                        food.add(cont);
                        cont = 0;
                    }
                }
            }
        }
        food.add(cont);
        for (int i = 0; i < food.size(); i++) {
            maxfood = Math.max(maxfood, food.get(i));
        }
        System.out.println(maxfood);
    }

}

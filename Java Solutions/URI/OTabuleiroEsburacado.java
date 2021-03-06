import java.io.*;

public class OTabuleiroEsburacado {

    static Boolean hasFallen(int x, int y) {
        return ((x == 1 && y == 3) || (x == 2 && y == 3) || (x == 2 && y == 5) || (x == 5 && y == 4));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), index = 0, moves = 0, x = 4, y = 3;
        int mov[] = new int[n];
        String s[] = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            mov[i] = Integer.parseInt(s[i]);
        }
        Boolean fall = false;
        while (index < n && !fall) {
            if (mov[index] == 1) {
                x++;
                y += 2;
            }

            if (mov[index] == 2) {
                x += 2;
                y++;
            }
            if (mov[index] == 3) {
                x += 2;
                y--;
            }
            if (mov[index] == 4) {
                x++;
                y -= 2;
            }
            if (mov[index] == 5) {
                x--;
                y -= 2;
            }
            if (mov[index] == 6) {
                x -= 2;
                y--;
            }
            if (mov[index] == 7) {
                x -= 2;
                y++;
            }
            if (mov[index] == 8) {
                x--;
                y += 2;
            }
            if (hasFallen(x, y)) {
                fall = true;
            }
            moves++;
            index++;
        }
        System.out.println(moves);
    }

}

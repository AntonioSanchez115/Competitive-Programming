import java.io.*;

public class Quadrado {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, sum, maxR = 0, maxC = 0, difRow = 0, difCol = 0, posR = 0, posC = 0;
        int prevNum, num = 0, sumR = 0, sumC = 0, newNum = 1;
        n = Integer.parseInt(br.readLine());
        int m[][] = new int[n][n];
        int row[] = new int[n], column[] = new int[n];

        for (int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                m[i][j] = Integer.parseInt(s[j]);
            }
        }
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                sum += m[i][j];
            }
            if (sum > maxR) {
                maxR = sum;
            }
            row[i] = sum;
        }
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                sum += m[j][i];
            }
            if (sum > maxC) {
                maxC = sum;
            }
            column[i] = sum;
        }

        int numRow[] = new int[maxR + 1], numCol[] = new int[maxC + 1];
        for (int i = 0; i <= maxR; i++) {
            numRow[i] = 0;
        }
        for (int i = 0; i <= maxC; i++) {
            numCol[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            numRow[row[i]]++;
        }
        for (int i = 0; i < n; i++) {
            numCol[column[i]]++;
        }

        for (int i = 0; i <= maxR; i++) {
            if (numRow[i] == 1) {
                difRow = i;
            }
        }
        for (int i = 0; i <= maxC; i++) {
            if (numCol[i] == 1) {
                difCol = i;
            }
            if (numCol[i] > 1) {
                num = i;
            }
        }

        for (int i = 0; i < n; i++) {
            if (row[i] == difRow) {
                posR = i;
            }
        }
        for (int i = 0; i < n; i++) {
            if (column[i] == difCol) {
                posC = i;
            }
        }

        prevNum = m[posR][posC];

        for (int i = 0; i < n; i++) {//rows
            if (i != posC) {
                sumR += m[posR][i];
            }
        }
        for (int i = 0; i < n; i++) {//cols
            if (i != posR) {
                sumC += m[i][posC];
            }
        }

        while (newNum <= 10000) {
            if ((sumR + newNum) == num && (sumC + newNum) == num) {
                break;
            }
            newNum++;
        }
        System.out.println(newNum + " " + prevNum);
    }

}

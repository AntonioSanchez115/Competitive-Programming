import java.io.*;

public class EBCDIC {

    static int octalToDecimal(int octalNumber) {
        int decimalNumber = 0, i = 0, rem;
        while (octalNumber != 0) {
            rem = octalNumber % 10;
            octalNumber /= 10;
            decimalNumber += rem * Math.pow(8, i);
            ++i;
        }
        return decimalNumber;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str, str1;
        int num;
        char table[] = new char[256];
        table[64] = ' ';
        for (int i = 129; i < 138; i++) {
            table[i] = (char) (i - 32);
        }
        for (int i = 145; i < 154; i++) {
            table[i] = (char) (i - 39);
        }
        for (int i = 162; i < 170; i++) {
            table[i] = (char) (i - 47);
        }
        for (int i = 193; i < 202; i++) {
            table[i] = (char) (i - 128);
        }
        for (int i = 209; i < 218; i++) {
            table[i] = (char) (i - 135);
        }
        for (int i = 226; i < 234; i++) {
            table[i] = (char) (i - 143);
        }
        for (int i = 240; i < 250; i++) {
            table[i] = (char) (i - 192);
        }
        while ((str = br.readLine()) != null) {
            for (int i = 0; i < str.length(); i += 4) {
                str1 = str.substring(i, i + 3);
                num = octalToDecimal(Integer.parseInt(str1));
                System.out.print(table[num]);
            }
            System.out.println("");
        }
    }

}

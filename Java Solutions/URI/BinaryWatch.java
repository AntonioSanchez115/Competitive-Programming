import java.io.*;

public class BinaryWatch {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            String s[] = str.split(":");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            int hour[] = new int[4], minute[] = new int[6];
            for (int i = 0; i < 4; i++) {
                hour[i] = 0;
            }
            for (int i = 0; i < 6; i++) {
                minute[i] = 0;
            }
            for (int i = 0; a > 0; i++) {
                hour[i] = a % 2;
                a /= 2;
            }
            for (int i = 0; b > 0; i++) {
                minute[i] = b % 2;
                b /= 2;
            }
            System.out.println(" ____________________________________________");
            System.out.println("|                                            |");
            System.out.println("|    ____________________________________    |_");
            System.out.println("|   |                                    |   |_)");
            System.out.println("|   |   8         4         2         1  |   |");
            System.out.println("|   |                                    |   |");
            System.out.print("|   |   ");
            for (int i = 3; i >= 0; i--) {
                System.out.print(((hour[i] == 1) ? "o" : " "));
                if (i != 0) {
                    System.out.print("         ");
                }
            }
            System.out.println("  |   |");
            System.out.println("|   |                                    |   |");
            System.out.println("|   |                                    |   |");
            System.out.print("|   |   ");
            for (int i = 5; i >= 0; i--) {
                System.out.print(((minute[i] == 1) ? "o" : " "));
                if (i != 0) {
                    System.out.print("     ");
                }
            }
            System.out.println("  |   |");
            System.out.println("|   |                                    |   |");
            System.out.println("|   |   32    16    8     4     2     1  |   |_");
            System.out.println("|   |____________________________________|   |_)");
            System.out.println("|                                            |");
            System.out.println("|____________________________________________|");
            System.out.println("");
        }
    }

}

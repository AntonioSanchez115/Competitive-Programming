import java.io.*;

public class CPFInputandOutput {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            for (int i = 0; i < 3; i++) {
                System.out.print(str.charAt(i));
            }
            System.out.println("");
            for (int i = 4; i < 7; i++) {
                System.out.print(str.charAt(i));
            }
            System.out.println("");
            for (int i = 8; i < 11; i++) {
                System.out.print(str.charAt(i));
            }
            System.out.println("");
            for (int i = 12; i < 14; i++) {
                System.out.print(str.charAt(i));
            }
            System.out.println("");
        }
    }

}

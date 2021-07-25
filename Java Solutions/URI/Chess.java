import java.io.*;

public class Chess {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        System.out.println(((((L % 2 == 1) && (C % 2 == 1)) || (!(L % 2 == 1) && !(C % 2 == 1)))) ? "1" : "0");
    }

}

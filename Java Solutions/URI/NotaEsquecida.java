import java.io.*;

public class NotaEsquecida {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        System.out.println(m * 2 - a);
    }

}

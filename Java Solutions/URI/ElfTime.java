import java.io.*;

public class ElfTime {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        System.out.println((((a + b) <= n) ? "Farei hoje!" : "Deixa para amanha!"));
    }

}

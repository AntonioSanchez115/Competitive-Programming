import java.io.*;

public class EvenSuccessor {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        System.out.println(((x % 2 != 0) ? x + 1 : x + 2));
    }

}

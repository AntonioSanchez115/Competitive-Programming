import java.io.*;

public class BacteriaI {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String D, S;
        while ((D = br.readLine()) != null) {
            S = br.readLine();
            System.out.println(((D.contains(S)) ? "Resistente" : "Nao resistente"));
        }
    }

}

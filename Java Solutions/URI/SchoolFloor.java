import java.io.*;

public class SchoolFloor {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double l, c;
        l = Double.parseDouble(br.readLine());
        c = Double.parseDouble(br.readLine());
        System.out.println((int) (((l - 1) * (c - 1)) + l * c));
        System.out.println((int) ((l - 1) * 2 + (c - 1) * 2));
    }

}

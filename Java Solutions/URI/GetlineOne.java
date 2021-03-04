import java.io.*;

public class GetlineOne {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name;
        double dist = 0, total = 0, n = 0;
        while ((name = br.readLine()) != null) {
            dist = Double.parseDouble(br.readLine());
            total += dist;
            n++;
        }
        System.out.printf("%.1f\n", total / n);
    }

}

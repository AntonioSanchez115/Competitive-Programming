
import java.io.*;

public class BuildingHouses {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s[] = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            if (a == 0) {
                break;
            }
            int b = Integer.parseInt(s[1]);
            int c = Integer.parseInt(s[2]);
            System.out.println((int) Math.sqrt((a * b) / ((double) c / 100.0)));
        }
    }
    
}

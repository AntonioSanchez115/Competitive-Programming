import java.io.*;

public class RobotBasketball {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int d = Integer.parseInt(br.readLine());
        if (d >= 0 && d <= 800) {
            System.out.println("1");
        } else if (d > 800 && d <= 1400) {
            System.out.println("2");
        } else {
            System.out.println("3");
        }
    }

}

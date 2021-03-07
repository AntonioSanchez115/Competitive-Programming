import java.io.*;

public class Variations {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t > 0) {
            String str = br.readLine();
            int sum = 0;
            if (Character.toLowerCase(str.charAt(0)) == 'a' || Character.toLowerCase(str.charAt(0)) == 'e' || Character.toLowerCase(str.charAt(0)) == 'i' || Character.toLowerCase(str.charAt(0)) == 'o' || Character.toLowerCase(str.charAt(0)) == 's') {
                sum = 3;
            } else {
                sum = 2;
            }
            for (int i = 1; i < str.length(); i++) {
                if (Character.toLowerCase(str.charAt(i)) == 'a' || Character.toLowerCase(str.charAt(i)) == 'e' || Character.toLowerCase(str.charAt(i)) == 'i' || Character.toLowerCase(str.charAt(i)) == 'o' || Character.toLowerCase(str.charAt(i)) == 's') {
                    sum *= 3;
                } else {
                    sum *= 2;
                }
            }
            System.out.println(sum);
            t--;
        }
    }

}

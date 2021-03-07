import java.io.*;

public class FlowersFlourishfromFrance {

    static boolean tauto(String s) {
        String vec[] = s.split(" ");
        char first = Character.toLowerCase(vec[0].charAt(0));
        for (int i = 0; i < vec.length; i++) {
            if (Character.toLowerCase(vec[i].charAt(0)) != first) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while (true) {
            str = br.readLine();
            if (str.charAt(0) == '*') {
                break;
            }
            System.out.println((tauto(str) ? "Y" : "N"));
        }
    }

}

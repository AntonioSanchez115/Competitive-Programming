import java.io.*;

public class DancingSentence {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        Boolean flag;
        while ((str = br.readLine()) != null) {
            flag = true;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ') {
                    if (flag) {
                        System.out.print(Character.toUpperCase(str.charAt(i)));
                        flag = false;
                    } else {
                        System.out.print(Character.toLowerCase(str.charAt(i)));
                        flag = true;
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }

}

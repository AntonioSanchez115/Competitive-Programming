import java.io.*;

public class StuttererDigitizer {

    static Boolean repeated(String str) {
        if (str.length() > 3) {
            return (str.charAt(0) == str.charAt(2) && str.charAt(1) == str.charAt(3));
        }
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = br.readLine(), aux;
        String vec[] = text.split(" ");
        for (int i = 0; i < vec.length; i++) {
            if (i != 0) {
                System.out.print(" ");
            }
            if (repeated(vec[i])) {
                aux = vec[i].substring(2);
                System.out.print(aux);
            } else {
                System.out.print(vec[i]);
            }
        }
        System.out.println("");
    }

}

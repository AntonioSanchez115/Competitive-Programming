import java.io.*;
import java.util.Arrays;

public class DietPlan {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        Boolean cheat;
        String diet, brek, lunch, str;
        while ((t--) > 0) {
            cheat = false;
            diet = br.readLine();
            brek = br.readLine();
            lunch = br.readLine();
            for (int i = 0; i < brek.length(); i++) {
                if (diet.indexOf(brek.charAt(i)) != -1) {
                    str = "";
                    for (int j = 0; j < diet.length(); j++) {
                        if (j != diet.indexOf(brek.charAt(i))) {
                            str += diet.charAt(j);
                        }
                    }
                    diet = str;
                } else {
                    cheat = true;
                }
            }
            for (int i = 0; i < lunch.length(); i++) {
                if (diet.indexOf(lunch.charAt(i)) != -1) {
                    str = "";
                    for (int j = 0; j < diet.length(); j++) {
                        if (j != diet.indexOf(lunch.charAt(i))) {
                            str += diet.charAt(j);
                        }
                    }
                    diet = str;
                } else {
                    cheat = true;
                }
            }
            if (cheat) {
                System.out.println("CHEATER");
            } else {
                char arr[] = diet.toCharArray();
                Arrays.sort(arr);
                String aux = new String(arr);
                System.out.println(aux);
            }
        }
    }

}

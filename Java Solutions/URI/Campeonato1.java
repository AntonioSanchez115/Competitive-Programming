import java.io.*;
import java.util.Vector;

public class Campeonato1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x, stage = 1;
        Vector<Integer> vec = new Vector<Integer>();
        Vector<Integer> vec2 = new Vector<Integer>();
        Boolean found = false;
        String s[] = br.readLine().split(" ");
        for (int i = 0; i < 16; i++) {
            x = Integer.parseInt(s[i]);
            vec.add(x);
        }
        for (int i = 0; i < 16; i += 2) {
            if ((vec.get(i) == 1 && vec.get(i + 1) == 9) || (vec.get(i) == 9 && vec.get(i + 1) == 1)) {
                found = true;
            } else if (vec.get(i + 1) == 1 || vec.get(i + 1) == 9) {
                vec2.add(vec.get(i + 1));
            } else {
                vec2.add(vec.get(i));
            }
        }
        vec.clear();
        if (!found) {
            for (int i = 0; i < 8; i += 2) {
                if ((vec2.get(i) == 1 && vec2.get(i + 1) == 9) || (vec2.get(i) == 9 && vec2.get(i + 1) == 1)) {
                    found = true;
                    stage = 2;
                } else if (vec2.get(i + 1) == 1 || vec2.get(i + 1) == 9) {
                    vec.add(vec2.get(i + 1));
                } else {
                    vec.add(vec2.get(i));
                }
            }
        }
        vec2.clear();
        if (!found) {
            for (int i = 0; i < 4; i += 2) {
                if ((vec.get(i) == 1 && vec.get(i + 1) == 9) || (vec.get(i) == 9 && vec.get(i + 1) == 1)) {
                    found = true;
                    stage = 3;
                } else if (vec.get(i + 1) == 1 || vec.get(i + 1) == 9) {
                    vec2.add(vec.get(i + 1));
                } else {
                    vec2.add(vec.get(i));
                }
            }
        }
        if (!found) {
            stage = 4;
        }
        if (stage == 1) {
            System.out.println("oitavas");
        }
        if (stage == 2) {
            System.out.println("quartas");
        }
        if (stage == 3) {
            System.out.println("semifinal");
        }
        if (stage == 4) {
            System.out.println("final");
        }
    }

}

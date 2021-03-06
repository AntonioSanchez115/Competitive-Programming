import java.io.*;
import java.util.Vector;

class Pair {

    String first;
    int second;

    Pair(String first, int second) {
        this.first = first;
        this.second = second;
    }

}

public class Simulator {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String instruction;
        Vector<Pair> var = new Vector<Pair>();
        while ((instruction = br.readLine()) != null) {

            String token[] = instruction.split(" ");
            if (token.length == 3) { //Assign
                String nameVar = token[0];
                int value = Integer.parseInt(token[2]);
                var.add(new Pair(nameVar, value));
            } else { //Sum
                String dest;
                int op1 = 0, op2 = 0;
                char c;

                Boolean varExist = false;
                for (int i = 0; i < var.size(); i++) {
                    if (var.get(i).first.equals(token[0])) {
                        varExist = true;
                    }
                }
                if (!varExist) {
                    var.add(new Pair(token[0], 0));
                }
                dest = token[0];

                c = token[2].charAt(0);
                if (c >= '0' && c <= '9') {
                    op1 = Integer.parseInt(token[2]);
                } else {
                    for (int i = 0; i < var.size(); i++) {
                        if (token[2].equals(var.get(i).first)) {
                            op1 = var.get(i).second;
                        }
                    }
                }

                c = token[4].charAt(0);
                if (c >= '0' && c <= '9') {
                    op2 = Integer.parseInt(token[4]);
                } else {
                    for (int i = 0; i < var.size(); i++) {
                        if (token[4].equals(var.get(i).first)) {
                            op2 = var.get(i).second;
                        }
                    }
                }

                for (int i = 0; i < var.size(); i++) {
                    if (var.get(i).first.equals(dest)) {
                        var.set(i, new Pair(var.get(i).first, (op1 + op2)));
                    }
                }
            }

        }
        System.out.println(var.get(var.size() - 1).second);
    }

}

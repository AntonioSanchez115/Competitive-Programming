
import java.io.*;
import java.util.*;

public class ParenthesisBalanceI {

    static boolean checkBalance(String str) {
        Deque<Character> s = new ArrayDeque<>();
        char c;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                s.push(str.charAt(i));
            } else if (str.charAt(i) == ')' || str.charAt(i) == '}' || str.charAt(i) == ']') {
                if (s.isEmpty()) {
                    return false;
                }
                if (str.charAt(i) == ')') {
                    c = s.pop();
                    if (c == '}' || c == ']') {
                        return false;
                    }
                }
                if (str.charAt(i) == '}') {
                    c = s.pop();
                    if (c == ')' || c == ']') {
                        return false;
                    }
                }
                if (str.charAt(i) == ']') {
                    c = s.pop();
                    if (c == ')' || c == '}') {
                        return false;
                    }
                }
            }
        }
        return s.isEmpty();
    }

    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(((checkBalance(str)) ? "correct" : "incorrect"));
        }
    }

}

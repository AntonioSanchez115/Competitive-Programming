import java.io.*;

public class BancoImobiliario {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        int I = Integer.parseInt(s[0]);
        int n = Integer.parseInt(s[1]);
        int D = I, E = I, F = I;
        for (int i = 0; i < n; i++) {
            s = br.readLine().split(" ");
            char c = s[0].charAt(0);
            char c1 = s[1].charAt(0);
            if (c == 'C') {
                int x = Integer.parseInt(s[2]);
                if (c1 == 'D') {
                    D -= x;
                }
                if (c1 == 'E') {
                    E -= x;
                }
                if (c1 == 'F') {
                    F -= x;
                }
            } else if (c == 'V') {
                int x = Integer.parseInt(s[2]);
                if (c1 == 'D') {
                    D += x;
                }
                if (c1 == 'E') {
                    E += x;
                }
                if (c1 == 'F') {
                    F += x;
                }
            } else {//A
                char c2 = s[2].charAt(0);
                int x = Integer.parseInt(s[3]);
                if (c1 == 'D') {
                    if (c2 == 'E') {
                        D += x;
                        E -= x;
                    }
                    if (c2 == 'F') {
                        D += x;
                        F -= x;
                    }
                } else if (c1 == 'E') {
                    if (c2 == 'D') {
                        E += x;
                        D -= x;
                    }
                    if (c2 == 'F') {
                        E += x;
                        F -= x;
                    }
                } else {
                    if (c2 == 'D') {
                        F += x;
                        D -= x;
                    }
                    if (c2 == 'E') {
                        F += x;
                        E -= x;
                    }
                }
            }
        }
        System.out.println(D + " " + E + " " + F);
    }

}

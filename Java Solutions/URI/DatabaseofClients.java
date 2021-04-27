import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class DatabaseofClients {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> db = new HashSet<String>();
        int t = Integer.parseInt(br.readLine());
        String mail, aux;
        while ((t--) > 0) {
            aux = "";
            mail = br.readLine();
            for (int i = 0; mail.charAt(i) != '@'; i++) {
                if (mail.charAt(i) != '.') {
                    aux += mail.charAt(i);
                }
            }
            mail = aux + mail.substring(mail.indexOf("@"));
            aux = "";
            for (int i = 0; mail.charAt(i) != '+' && mail.charAt(i) != '@'; i++) {
                aux += mail.charAt(i);
            }
            mail = aux + mail.substring(mail.indexOf("@"));
            db.add(mail);
        }
        System.out.println(db.size());
    }

}

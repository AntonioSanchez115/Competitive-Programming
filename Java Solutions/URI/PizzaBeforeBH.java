/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;

/**
 *
 * @author hp
 */
public class PizzaBeforeBH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String aux;
        while ((aux = br.readLine()) != null) {
            String str[] = aux.split(" ");
            int n = Integer.parseInt(str[0]);
            int d = Integer.parseInt(str[1]);
            String[] date = new String[50];
            String confirmedDate = "";
            boolean eventHold = false, c;
            for (int i = 0; i < d; i++) {
                int confirmed = 0;
                String s[] = br.readLine().split(" ");
                date[i] = s[0];
                for (int j = 1; j <= n; j++) {
                    c = s[j].equals("1");
                    if (c) confirmed++;
                }
                if (confirmed == n && eventHold == false) {
                    eventHold = true;
                    confirmedDate = date[i];
                }
            }
            if (eventHold) {
                System.out.println(confirmedDate);
            } else {
                System.out.println("Pizza antes de FdI");
            }
        }
    }

}
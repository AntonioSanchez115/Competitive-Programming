/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;

/**
 *
 * @author asus
 */
public class Diving {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while (n > 0) {
            String name = br.readLine();
            double sum = 0, d = Double.parseDouble(br.readLine()), Max = 0, Min = 0;
            String str[] = br.readLine().split(" ");
            for (int i = 0; i < 7; i++) {
                double s = Double.parseDouble(str[i]);
                if (i == 0) {
                    Max = s;
                    Min = s;
                } else {
                    if (s < Min) {
                        Min = s;
                    }
                    if (s > Max) {
                        Max = s;
                    }
                }
                sum += s;
            }
            sum -= (Min + Max);
            System.out.print(name + " ");
            System.out.printf("%.2f\n", (sum * d));
            n--;
        }
    }

}

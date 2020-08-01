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
public class PeaksandValleys {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int p = 0, n = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split(" ");
        boolean type = false, patt = true, flag = false;
        for (int i = 0; i < n; i++) {
            int a = Integer.parseInt(s[i]);
            if (i == 0) {
                p = a;
            } else {
                if (i == 1) {
                    if ((p - a) < 0) {
                        type = false;
                        flag = false;
                    } else {
                        type = true;
                        flag = true;
                    }
                }
                if (type) {//peak
                    if (flag) {
                        if (p <= a) {
                            patt = false;
                            break;
                        } else if (p >= a) {
                            flag = false;
                            p = a;
                        }
                    } else {
                        if (p >= a) {
                            patt = false;
                            break;
                        } else if (p < a) {
                            flag = true;
                            p = a;
                        }
                    }
                } else {//valley
                    if (flag) {
                        if (p <= a) {
                            patt = false;
                            break;
                        } else {
                            flag = false;
                            p = a;
                        }
                    } else {
                        if (p >= a) {
                            patt = false;
                            break;
                        } else {
                            flag = true;
                            p = a;
                        }
                    }
                }
            }
        }
        System.out.println((patt) ? 1 : 0);
    }

}

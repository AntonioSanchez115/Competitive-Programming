import java.io.*;

public class WhatistheFastest {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        double O = Double.parseDouble(s[0]);
        double B = Double.parseDouble(s[1]);
        double I = Double.parseDouble(s[2]);
        if (O < B && O < I) {
            System.out.println("Otavio");
        } else if (B < O && B < I) {
            System.out.println("Bruno");
        } else if (I < O && I < B) {
            System.out.println("Ian");
        } else {
            System.out.println("Empate");
        }
    }

}

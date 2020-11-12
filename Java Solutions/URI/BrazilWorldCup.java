import java.io.*;
public class BrazilWorldCup {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s = br.readLine())!=null){
            int n = Integer.parseInt(s);
            if(n==0) System.out.println("vai ter copa!");
            else System.out.println("vai ter duas!");
        }
    }
    
}

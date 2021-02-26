import java.io.*;

public class TopN {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        System.out.print("Top ");
        if(k<=1) System.out.println("1");
        else if(k<=3) System.out.println("3");
        else if(k<=5) System.out.println("5");
        else if(k<=10) System.out.println("10");
        else if(k<=25) System.out.println("25");
        else if(k<=50) System.out.println("50");
        else System.out.println("100");
    }
    
}

import java.io.*;
public class BacktoHighSchoolPhysics {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while((str=br.readLine())!=null){
            String s[] = str.split(" ");
            int v = Integer.parseInt(s[0]);
            int t = Integer.parseInt(s[1]);
            System.out.println(v*t*2);
        }
    }
    
}

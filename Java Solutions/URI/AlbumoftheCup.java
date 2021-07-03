import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class AlbumoftheCup {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> album = new HashSet<Integer>();     
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        while ((m--) > 0) {
            int x = Integer.parseInt(br.readLine());
            album.add(x);
        }
        System.out.println(n - album.size());       
    }
    
}

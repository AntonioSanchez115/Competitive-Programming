
import java.io.*;
import java.util.*;

public class Dijkstra {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        Set<String> mySet = new TreeSet<String>();
        while ((str = br.readLine()) != null) {
            mySet.add(str);
        }
        System.out.println(mySet.size());
    }

}

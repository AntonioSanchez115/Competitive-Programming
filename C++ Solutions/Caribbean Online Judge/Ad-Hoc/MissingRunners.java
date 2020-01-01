package COJ;

/**
 *
 * @author Antonio
 * COJ
 * 4135 - Missing Runners
 */
import java.util.*;
import java.io.*;
public class MissingRunners {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int sum = ((n+1)*n)/2;
        int acum = 0;
        String s[] = br.readLine().split(" ");
        for(int i=0;i<n-1;i++){
            acum += Integer.parseInt(s[i]);
        }
        System.out.println(sum-acum);
    }
}

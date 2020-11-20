import java.io.*;

public class CorrectAnswers {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int largest = 0, sum = 0;
        int k = Integer.parseInt(br.readLine());
        String des = br.readLine();
        int n = Integer.parseInt(br.readLine());
        String sheet[] = new String[n];
        int ans[] = new int[91];
        for (int i = 0; i < n; i++) {
            sheet[i] = br.readLine();
        }
        for (int i = 0; i < k; i++) {
            for (int x = 0; x < 91; x++) {
                ans[x] = 0;
            }
            largest = 0;
            for (int j = 0; j < n; j++) {
                if (sheet[j].charAt(i) != des.charAt(i)) {
                    ans[(sheet[j].charAt(i) - 0)]++;
                }
            }
            for (int x = 0; x < 91; x++) {
                largest = Math.max(largest, ans[x]);
            }
            sum += largest;
        }
        System.out.println(sum);
    }

}

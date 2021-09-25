import java.io.*;
import java.util.StringTokenizer;

public class Sanizzang {
    static int cases;
    static int cnt;
    static int l;
    static int p;
    static int v;
    static int result;

    public static void main(String[] arg) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        cases = 0;
        cnt = 1;

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            l = Integer.parseInt(st.nextToken());
            p = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());

            if (l == 0 && p == 0 && v == 0)
                break;

            result = (((v / p) * l)) + Math.min(l, (v % p));
            System.out.println("Case " + cnt++ + ": " + result);
        }
    }
}

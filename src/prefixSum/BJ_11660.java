package prefixSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * title: 구간 합 구하기 5
 * level: 실버 1
 * memory(KB): 120788
 * time(ms): 848
 * size(B): 1316
 */
public class BJ_11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = getToken(st);
        int m = getToken(st);
        long[][] S = new long[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= n; j++) {
                S[i][j] = S[i][j - 1] + S[i - 1][j] - S[i - 1][j - 1] + getToken(st);
            }
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x1 = getToken(st);
            int y1 = getToken(st);
            int x2 = getToken(st);
            int y2 = getToken(st);

            long answer = S[x2][y2] - S[x1 - 1][y2] - S[x2][y1 - 1] + S[x1 - 1][y1 - 1];
            sb.append(answer).append("\n");
        }
        System.out.println(sb);
        br.close();
    }

    private static int getToken(StringTokenizer st) {
        return Integer.parseInt(st.nextToken());
    }
}

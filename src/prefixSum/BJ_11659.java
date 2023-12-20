package prefixSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * title: 구간 합 구하기 4
 * level: 실버 3
 * memory(KB): 54556
 * time(ms): 584
 * size(B): 1086
 */
public class BJ_11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] S = new int[n + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            int item = Integer.parseInt(st.nextToken());
            S[i] = S[i - 1] + item;
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int calc = S[b] - S[a - 1];
            sb.append(calc).append("\n");
        }

        System.out.println(sb);
        br.close();
    }
}

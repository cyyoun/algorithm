package stackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * title: 단어 뒤집기
 * level: 브론즈 1
 * memory(KB): 40936KB
 * time(ms): 472ms
 * size(B): 841B
 */
public class BJ_9093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                char[] arr = st.nextToken().toCharArray();
                for (int j = arr.length - 1; j >= 0; j--) {
                    sb.append(arr[j]);
                }
                sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}


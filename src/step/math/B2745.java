package step.math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * title: 진법변환
 * level: 브론즈 2
 * memory(KB): 14264
 * time(ms): 128
 * size(B): 150
 */
public class B2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String su = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        int answer = 0;
        for (int i = 0; i < su.length(); i++) {
            char c = su.charAt(i);
            int revertChar = c - '0' > 9 ? c - 'A' + 10 : c - '0';
            answer += (int) (Math.pow(b, su.length() - i - 1) * revertChar);
        }
        System.out.println(answer);
    }
}

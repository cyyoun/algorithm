package stackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * title: 스택
 * level: 실버 4
 * memory(KB): 20180
 * time(ms): 204
 * size(B): 1124
 */
public class BJ_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Integer> st = new Stack<>();
        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            String line = br.readLine();
            int num;
            if (line.contains("push")) {
                num = Integer.parseInt(line.split(" ")[1]);
                st.push(num);
                continue;
            } else if (line.equals("top")) {
                num = st.isEmpty() ? -1 : st.peek();
            } else if (line.equals("size")) {
                num = st.size();
            } else if (line.equals("pop")) {
                num = st.isEmpty() ? -1 : st.pop();
            } else {
                num = st.isEmpty() ? 1 : 0;
            }
            sb.append(num).append('\n');
        }
        System.out.print(sb);
    }
}

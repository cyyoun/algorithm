package stackAndQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * title: 큐
 * level: 실버 4
 * memory(KB): 19656
 * time(ms): 196
 * size(B): 1505
 */
public class BJ_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        ArrayList<Integer> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            int su = 0;
            switch (s) {
                case "push" -> {
                    String num = st.nextToken();
                    list.add(Integer.parseInt(num));
                    continue;
                }
                case "front" -> su = list.isEmpty() ? -1 : list.get(0);
                case "back" -> su = list.isEmpty() ? -1 : list.get(list.size() - 1);
                case "size" -> su = list.size();
                case "empty" -> su = list.isEmpty() ? 1 : 0;
                case "pop" -> {
                    if (list.isEmpty()) {
                        su = -1;
                    } else {
                        su = list.get(0);
                        list.remove(0);
                    }
                }
            }
            sb.append(su).append('\n');
        }
        System.out.print(sb);
    }
}

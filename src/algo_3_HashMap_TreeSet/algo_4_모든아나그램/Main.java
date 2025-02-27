package algo_3_HashMap_TreeSet.algo_4_모든아나그램;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private static void solution(String s, String t) {
        int idx1 = 0;
        int answer = 0;
        int cnt = 0;
        HashMap<Character, Integer> targetMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            if (targetMap.containsKey(key)) {
                int value = targetMap.get(key);
                if (value == 0) {
                    cnt--;
                }
                targetMap.put(key, --value);
                if (value == 0) {
                    cnt++;
                }
            }
            if (i >= t.length()) {
                char backKey = s.charAt(idx1++);
                if (targetMap.containsKey(backKey)) {
                    int value = targetMap.get(backKey);
                    if (value == 0) {
                        cnt--;
                    }
                    targetMap.put(backKey, ++value);
                    if (value == 0) {
                        cnt++;
                    }

                }
            }
            if (cnt == targetMap.size()) {
                answer++;
            }
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        solution(s, t);

    }
}

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

    private static void solution2(String s, String t) {
        int idx1 = 0;
        int answer = 0;
        int cnt = 0;
        HashMap<Character, Integer> targetMap = new HashMap<>();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            if (i >= t.length() - 1) {
                if (map.equals(targetMap)) {
                    answer++;
                }
                char backKey = s.charAt(idx1++);
                Integer value = map.get(backKey) - 1;
                if (value == 0) {
                    map.remove(backKey);
                } else {
                    map.put(backKey, value);
                }
            }
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        solution2(s, t);

    }
}

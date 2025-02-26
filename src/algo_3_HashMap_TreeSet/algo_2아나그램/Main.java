package algo_3_HashMap_TreeSet.algo_2아나그램;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static void solution(String str1, String str2) {
        Map<String, Integer> map1 = createMap(str1);
        Map<String, Integer> map2 = createMap(str2);

        if (map1.size() != map2.size()) {
            System.out.println("NO");
            return;
        }

        for (String s : map2.keySet()) {
            if (map1.get(s) != map2.get(s)) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

    private static void solution2(String str1, String str2) {
        Map<String, Integer> map1 = createMap(str1);

        for (char c : str2.toCharArray()) {
            String key = Character.toString(c);
            if (!map1.containsKey(key) || map1.get(key) == 0) {
                //두번째 문자열에서 같은 키값이 들어왔는데 이미 0이라는 것은 해당 문자가 초과해서 있다는 얘기임.
                System.out.println("NO");
                return;
            }
            map1.put(key, map1.get(key) - 1);
        }

        /*for (String s : map1.keySet()) {
            if (map1.get(s) != 0) {
                System.out.println("NO");
                return;
            }
        }*/

        System.out.println("YES");
    }


    private static Map<String, Integer> createMap(String str1) {
        Map<String, Integer> map1 = new HashMap<>();
        for (char c : str1.toCharArray()) {
            String key = Character.toString(c);
            map1.put(key, map1.getOrDefault(key, 0) + 1);
        }

        return map1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        solution(str1, str2);
    }
}

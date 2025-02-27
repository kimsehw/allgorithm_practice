package algo_3_HashMap_TreeSet.algo_3_매출액종류;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static void solution(int[] arr, int targetLen) {
        int idx1 = 0;
        Map<Integer, Integer> map = new HashMap<>();
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            if (i >= targetLen - 1) {
                answer.append(map.size()).append(" ");
                int cnt = map.get(arr[idx1]) - 1;
                if (cnt < 1) {
                    map.remove(arr[idx1]);
                } else {
                    map.put(arr[idx1], cnt);
                }
                idx1++;
            }
        }

        System.out.println(answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int targetLen = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        solution(arr, targetLen);
    }
}

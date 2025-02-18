package 문자열_배열.algo_10가장짧은문자;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static void solution(String input, String target) {
        String str = input;
        List<Integer> idxs = new ArrayList<>();
        int idx = 0;
        while (input.indexOf(target, idx) != -1) {
            idx = input.indexOf(target, idx);
            idxs.add(idx);
            idx++;
        }
        int[] answer = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            int distance = Math.abs(i - idxs.get(0));
            answer[i] = distance;
        }
        for (Integer index : idxs.subList(1, idxs.size())) {
            for (int i = 0; i < input.length(); i++) {
                int distance = Math.abs(i - index);
                if (answer[i] > distance) {
                    answer[i] = distance;
                }
            }
        }
        for (int i : answer) {
            System.out.print(i + "");
        }
    }

    private static void solution2(String input, String target) {
        // 왼쪽 끝 타겟으로부터의 거리 구하고 타겟 만날때마다 0으로 초기화
        // 같은 로직으로 오른쪽 끝 타겟으로부터 거리 구하며 최소값으로 입력

        int[] answer = new int[input.length()];
        int firstIdx = input.indexOf(target);
        int lastIdx = input.lastIndexOf(target);
        int pos = 1000;

        for (int i = 0; i < input.length(); i++) {
            if (String.valueOf(input.charAt(i)).equals(target)) {
                pos = 0;
                answer[i] = pos;
                continue;
            }
            pos++;
            answer[i] = pos;
        }
        pos = 1000;
        for (int i = input.length() - 1; i >= 0; i--) {
            if (String.valueOf(input.charAt(i)).equals(target)) {
                pos = 0;
                answer[i] = pos;
                continue;
            }
            pos++;
            answer[i] = Math.min(answer[i], pos);
        }
        for (int i : answer) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String target = sc.next();
        solution2(input, target);
    }
}

package algo_4_StackQueue.algo_6_공주구하기;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    private static void solution(int n, int k) {
        Deque<Integer> princes = new LinkedList<>();
        for (int i = 1; i < n + 1; i++) {
            princes.addLast(i);
        }
        int cnt = 0;
        while (princes.size() > 1) {
            cnt++;
            if (cnt == k) {
                princes.removeFirst();
                cnt = 0;
            } else {
                princes.addLast(princes.removeFirst());
            }
        }
        System.out.println(princes.peek());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        solution(n, k);
    }
}

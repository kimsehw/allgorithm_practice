package algo_1_StringAndArray.algo_20등수구하기;

import static java.lang.System.in;

import java.util.Scanner;

public class Main {
    private static void solution(int[] scores) {
        int[] rank = new int[scores.length];
        for (int i = 0; i < scores.length; i++) {
            rank[i]++;
            for (int j = 0; j < scores.length; j++) {
                if (scores[i] > scores[j]) {
                    rank[j]++;
                }
            }
        }
        for (int i : rank) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();
        }
        solution(scores);
    }
}

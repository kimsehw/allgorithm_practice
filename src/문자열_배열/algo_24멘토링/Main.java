package 문자열_배열.algo_24멘토링;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static void solution(int n, int m, int[][] score) {
        boolean[][] caseCnt = new boolean[n][n];
        for (boolean[] booleans : caseCnt) {
            Arrays.fill(booleans, true);
        }
        for (int i = 0; i < m; i++) {
            ArrayList<Integer> preStudents = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                int nowStudent = score[i][j];
                preStudents.add(score[i][j]);
                for (Integer preStudent : preStudents) {
                    caseCnt[nowStudent - 1][preStudent - 1] = false;
                }
            }
        }
        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (caseCnt[i][j]) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }

    private static void solution2(int n, int m, int[][] score) {
        int answer = 0;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (i == j) {
                    continue;
                }
                int cnt = 0;
                for (int k = 0; k < m; k++) {
                    int pi = 0, pj = 0;
                    for (int l = 0; l < n; l++) {
                        if (score[k][l] == i) {
                            pi = l;
                        }
                        if (score[k][l] == j) {
                            pj = l;
                        }
                    }
                    if (pi > pj) {
                        cnt++;
                    }
                }
                if (cnt == m) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] score = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                score[i][j] = sc.nextInt();
            }
        }
        solution2(n, m, score);
    }
}

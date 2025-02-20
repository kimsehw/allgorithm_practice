package algo_1_StringAndArray.algo_22봉우리;

import java.util.Scanner;

public class Main {

    private static void solution(int n, int[][] arr) {
        int answer = 0;
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                if (isPeak2(i, j, arr)) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }

    private static boolean isPeak(int i, int j, int[][] arr) {
        if (arr[i - 1][j] >= arr[i][j]) {
            return false;
        }
        if (arr[i][j - 1] >= arr[i][j]) {
            return false;
        }
        if (arr[i + 1][j] >= arr[i][j]) {
            return false;
        }
        if (arr[i][j + 1] >= arr[i][j]) {
            return false;
        }
        return true;
    }

    private static boolean isPeak2(int i, int j, int[][] arr) {
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        for (int k = 0; k < dx.length; k++) {
            if (arr[i + dx[k]][j + dy[k]] >= arr[i][j]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n + 2][n + 2];
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        solution(n, arr);
    }
}

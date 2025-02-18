package 문자열_배열.algo_21격자판최대합;

import java.util.Scanner;

public class Main {

    private static void solution(int n, int[][] arr) {
        int colMax = 0;
        int rowMax = 0;
        int rowSum = 0;
        int colSum = 0;
        int lDiagSum = 0;
        int rDiagSum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowSum += arr[i][j];
                colSum += arr[j][i];
                if (i == j) {
                    lDiagSum += arr[i][j];
                }
                if (i + j == n - 1) {
                    rDiagSum += arr[i][j];
                }
            }
            if (rowSum > rowMax) {
                rowMax = rowSum;
            }
            if (colSum > colMax) {
                colMax = colSum;
            }
            rowSum = 0;
            colSum = 0;
        }
        System.out.println(Math.max(Math.max(rowMax, colMax), Math.max(lDiagSum, rDiagSum)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        solution(n, arr);
    }
}

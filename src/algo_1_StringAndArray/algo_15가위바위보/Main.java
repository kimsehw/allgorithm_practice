package algo_1_StringAndArray.algo_15가위바위보;

import java.util.Scanner;

public class Main {

    private static void solution(int[][] arr) {
        for (int i = 0; i < arr[0].length; i++) {
            System.out.println(game(arr[0][i], arr[1][i]));
        }
    }

    private static String game(int a, int b) {
        if (a == b) {
            return "D";
        }
        if ((a == 1 && b == 3) || (a == 2 && b == 1) || (a == 3 && b == 2)) {
            return "A";
        }
        return "B";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = getArr(n, sc);
        solution(arr);
    }

    private static int[][] getArr(int n, Scanner sc) {
        int[][] arr = new int[2][n];
        extracted(n, arr, 0, sc);
        extracted(n, arr, 1, sc);
        return arr;
    }

    private static void extracted(int n, int[][] arr, int x, Scanner sc) {
        for (int i = 0; i < n; i++) {
            arr[x][i] = sc.nextInt();
        }
    }
}

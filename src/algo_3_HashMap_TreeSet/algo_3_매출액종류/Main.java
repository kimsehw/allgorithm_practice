package algo_3_HashMap_TreeSet.algo_3_매출액종류;

import java.util.Scanner;

public class Main {

    private static void solution(int[] arr, int targetLen) {

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

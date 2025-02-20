package algo_2_TwoPointer_SlidingWindow.algo_4_연속부분수열_retry;

import java.util.Scanner;

public class Main {

    private static void solution(int target, int[] arr) {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = getArr(n, sc);
        solution(target, arr);
    }

    private static int[] getArr(int n, Scanner sc) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}

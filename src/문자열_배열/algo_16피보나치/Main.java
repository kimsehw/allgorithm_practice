package 문자열_배열.algo_16피보나치;

import java.util.Scanner;

public class Main {

    private static void solution(int n) {
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        for (int i : arr) {
            if (i == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }

    private static int fibo(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        return fibo(num - 1) + fibo(num - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution(n);
    }
}

package algo_1_StringAndArray.algo_17소수;

import java.util.Scanner;

public class Main {

    private static void solution(int n) {
        int[] arr = new int[n - 1];
        int answer = 0;
        for (int i = 2; i < n + 1; i++) {
            arr[i - 2] = i;
        }
        for (int i = 0; i < (int) Math.sqrt(n); i++) {
            if (arr[i] == 0) {
                continue;
            }
            for (int j = i + 1; j < n - 1; j++) {
                if (arr[j] % arr[i] == 0) {
                    arr[j] = 0;
                }
            }
        }
        for (int i : arr) {
            if (i != 0) {
                answer++;
            }
        }
//        System.out.println(Arrays.toString(arr));
        System.out.println(answer);
    }


    private static void solution2(int n) {
        boolean[] chk = new boolean[n + 1];
        int answer = 0;
        for (int i = 2; i <= n; i++) {
            if (!chk[i]) {
                answer++;
                for (int j = i; j <= n; j += i) {
                    chk[j] = true;
                }
            }
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution2(n);
    }
}

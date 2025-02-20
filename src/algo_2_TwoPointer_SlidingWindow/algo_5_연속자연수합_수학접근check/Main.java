package algo_2_TwoPointer_SlidingWindow.algo_5_연속자연수합_수학접근check;

import java.util.Scanner;

public class Main {
    private static void solution(int n) {
        int mid;
        if (n % 2 == 0) {
            mid = n / 2;
        } else {
            mid = n / 2 + 1;
        }
        int idx2 = 1;
        int sum = 0;
        int answer = 0;
        for (int idx = 1; idx <= mid; idx++) {
            sum += idx;
            while (sum > n) {
                sum -= idx2++;
            }
            if (sum == n) {
                answer++;
            }
        }
        System.out.println(answer);
    }

    private static void solution2(int n) {
        int cnt = 1;
        n -= cnt;
        int answer = 0;
        while (n > 0) {
            cnt++;
            n -= cnt;
            if (n % cnt == 0) {
                answer++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution(n);
    }
}

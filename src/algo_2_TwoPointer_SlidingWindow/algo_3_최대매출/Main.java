package algo_2_TwoPointer_SlidingWindow.algo_3_최대매출;

import java.util.Scanner;

public class Main {
    private static void solution(int k, int[] arr) {
        int answer = 0;
        int sum = 0;
        for (int i = 0; i < arr.length - k - 1; i++) {
            if (i == 0) {
                for (int j = i; j < k + i; j++) {
                    sum += arr[j];
                }
                answer = sum;
                continue;
            }

            sum -= arr[i - 1];
            sum += arr[k + i - 1];
            
            if (answer < sum) {
                answer = sum;
            }
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = getArr(n, sc);
        solution(k, arr);
    }

    private static int[] getArr(int n, Scanner sc) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}

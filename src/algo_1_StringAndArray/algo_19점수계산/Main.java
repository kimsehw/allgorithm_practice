package algo_1_StringAndArray.algo_19점수계산;

import java.util.Scanner;

public class Main {

    private static void solution(int[] arr) {
        int score = 0;
        int answer = 0;
        for (int ans : arr) {
            if (ans != 0) {
                score++;
            }
            if (ans == 0) {
                score = 0;
            }
            answer += score;
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        solution(arr);
    }
}

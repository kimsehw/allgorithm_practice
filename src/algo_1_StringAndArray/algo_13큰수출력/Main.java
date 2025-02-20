package algo_1_StringAndArray.algo_13큰수출력;

import java.util.Scanner;

public class Main {

    private static void solution(int[] arr) {
        StringBuilder answer = new StringBuilder();
        answer.append(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i]) {
                answer.append(" ").append(arr[i]);
            }
        }
        System.out.println(answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = getArr(n, sc);
        solution(arr);
    }

    private static int[] getArr(int n, Scanner sc) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}

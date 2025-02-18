package 문자열_배열.algo_14보이는학생;

import java.util.Scanner;

public class Main {

    private static void solution(int[] arr) {
        int tallest = 0;
        int answer = 0;
        for (int tall : arr) {
            if (tall > tallest) {
                tallest = tall;
                answer++;
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

package algo_5_sorting_searching.algo_5_중복확인;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static void solution(int[] arr) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                System.out.println("D");
                return;
            }
        }
        System.out.println("U");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        solution(arr);
    }
}

package 문자열_배열.algo_18뒤집은소수;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    private static void solution(int[] arr) {
        int max = 0;
        for (int i : arr) {
            if (i >= max) {
                max = i;
            }
        }

        boolean[] chk = new boolean[max + 1];
        for (int i = 2; i <= max; i++) {
            if (!chk[i]) {
                for (int j = i + i; j <= max; j += i) {
                    chk[j] = true;
                }
            }
        }

        Set<Integer> sosu = new HashSet<>();
        for (int i = 2; i <= max; i++) {
            if (!chk[i]) {
                sosu.add(i);
            }
        }

        for (int num : arr) {
            if (sosu.contains(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            String input = new StringBuilder(sc.next()).reverse().toString();
            arr[i] = Integer.parseInt(input);
        }
        solution(arr);
    }
}

package algo_3_HashMap_TreeSet.algo_5_k큰수;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    private static void solution(int k, int[] arr) {
        TreeSet<Integer> set = new TreeSet<>(Comparator.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int l = j + 1; l < arr.length; l++) {
                    set.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int cnt = 0;
        for (Integer integer : set) {
            cnt++;
            if (cnt == k) {
                System.out.println(integer);
                return;
            }
        }
        System.out.println(-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        solution(k, arr);
    }
}

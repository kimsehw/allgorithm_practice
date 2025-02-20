package algo_2_TwoPointer_SlidingWindow.algo_6_최대길이연속부분수열;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static void solution(int k, int[] arr) {
        List<Integer> blankIdxs = new ArrayList<>();
        blankIdxs.add(-1);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                blankIdxs.add(i);
            }
        }
        int max = 0;
        for (int i = 1; i < blankIdxs.size() - k; i++) {
            int length = blankIdxs.get(i + k) - blankIdxs.get(i - 1) - 1;
            max = Math.max(length, max);
        }
        System.out.println(max);
    }

    private static void solution2(int k, int[] arr) {
        int idx2 = 0;
        int cnt = 0;
        int max = 0;
        for (int idx1 = 0; idx1 < arr.length; idx1++) {
            if (arr[idx1] == 0) {
                cnt++;
                if (cnt > k) {
                    while (arr[idx2] != 0) {
                        idx2++;
                    }
                    idx2++;
                    cnt--;
                }
            }
            max = Math.max(idx1 - idx2 + 1, max);
        }

        System.out.println(max);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = getArr(n, sc);
        solution2(k, arr);
    }

    private static int[] getArr(int n, Scanner sc) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}

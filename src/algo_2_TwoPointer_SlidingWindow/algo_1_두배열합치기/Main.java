package algo_2_TwoPointer_SlidingWindow.algo_1_두배열합치기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static void solution(int[] arr, int[] arr2) {
        int idx = 0;
        int idx2 = 0;
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length + arr2.length; i++) {
            if (idx == arr.length) {
                answer.add(arr2[idx2++]);
                continue;
            }
            if (idx2 == arr2.length) {
                answer.add(arr[idx++]);
                continue;
            }
            if (arr[idx] <= arr2[idx2]) {
                answer.add(arr[idx++]);
                continue;
            }
            answer.add(arr2[idx2++]);

        }

        for (Integer ans : answer) {
            System.out.print(ans + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = getArr(n, sc);
        int m = sc.nextInt();
        int[] arr2 = getArr(m, sc);
        solution(arr, arr2);
    }

    private static int[] getArr(int n, Scanner sc) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}

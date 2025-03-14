package algo_5_sorting_searching.algo_3_insertionSort;

import java.util.Scanner;

public class Main {
    private static void solution(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int insert = arr[i];
            int j;
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] <= insert) {
                    break;
                }
                arr[j + 1] = arr[j];
                // arr[j] = insert; 바꿀때마다 갱신
            }
            arr[j + 1] = insert; // 마지막에만 갱신
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
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

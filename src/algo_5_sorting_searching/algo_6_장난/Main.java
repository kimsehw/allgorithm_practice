package algo_5_sorting_searching.algo_6_장난;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static void solution(int[] arr) {
        int chulIdx = -1;
        int friendIdx = -1;
        int[] sort = arr.clone();
        Arrays.sort(sort);
        for (int i = 0; i < arr.length; i++) {
            if (sort[i] != arr[i]) {
                if (chulIdx == -1) {
                    chulIdx = i + 1;
                } else {
                    friendIdx = i + 1;
                }
            }
        }

        System.out.println(chulIdx + " " + friendIdx);
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

package algo_4_StackQueue.algo_3_크레인;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    private static void solution(int[][] board, int[] moves, int n, int m) {

        Stack<Integer> basket = new Stack<>();
        int answer = 0;
        for (int move : moves) {
            for (int i = 0; i < n; i++) {
                int doll = board[i][move - 1];
                if (doll != 0) {
                    board[i][move - 1] = 0;
                    if (!basket.empty() && basket.peek() == doll) {
                        basket.pop();
                        answer++;
                        answer++;
                    } else {
                        basket.push(doll);
                    }
                    break;
                }
            }
        }
        System.out.println(answer);
    }

    private static void solution2(ArrayList<Queue<Integer>> board, int[] moves, int n) {
        Stack<Integer> basket = new Stack<>();
        int answer = 0;

        for (int move : moves) {
            Queue<Integer> dolls = board.get(move - 1);
            if (!dolls.isEmpty()) {
                int doll = dolls.poll();
                if (basket.empty() || basket.peek() != doll) {
                    basket.push(doll);
                } else {
                    basket.pop();
                    answer++;
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Queue<Integer>> board = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            board.add(new LinkedList<>());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int doll = sc.nextInt();
                if (doll != 0) {
                    board.get(j).add(doll);
                }
            }
        }
        /*int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }*/
        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }

        //solution(board, moves, n, m);
        solution2(board, moves, n);
    }
}

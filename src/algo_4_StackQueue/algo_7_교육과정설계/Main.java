package algo_4_StackQueue.algo_7_교육과정설계;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    private static void solution(String mustOrder, String order) {
        Queue<Character> queue = new LinkedList<>();
        for (Character c : mustOrder.toCharArray()) {
            queue.add(c);
        }

        for (Character c : order.toCharArray()) {
            if (queue.peek() == c) {
                queue.poll();
                continue;
            }
            if (queue.contains(c)) {
                System.out.println("NO");
                return;
            }
        }

        if (queue.isEmpty()) {
            System.out.println("YES");
            return;
        }
        System.out.println("NO");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mustOrder = sc.next();
        String order = sc.next();
        solution(mustOrder, order);
    }
}

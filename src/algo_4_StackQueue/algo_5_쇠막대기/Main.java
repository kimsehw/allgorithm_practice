package algo_4_StackQueue.algo_5_쇠막대기;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    private static void solution(String str) {
        Stack<Character> stack = new Stack<>();
        boolean isLastOpen = true;
        int ans = 0;
        for (char c : str.toCharArray()) {
            if (c == ')') {
                stack.pop();
                if (isLastOpen) {
                    ans += stack.size();
                } else {
                    ans++;
                }
                isLastOpen = false;
                continue;
            }
            stack.push(c);
            isLastOpen = true;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        solution(str);
    }
}

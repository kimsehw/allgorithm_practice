package algo_1_StringAndArray.algo_11문자열압축;

import java.util.Scanner;

public class Main {

    private static void solution(String str) {
        StringBuilder answer = new StringBuilder();
        int cnt = 1;
        for (int i = 0; i < str.length(); i++) {
            boolean isContinue = (i != str.length() - 1) && (str.charAt(i) == str.charAt(i + 1));
            if (isContinue) {
                cnt++;
            }
            if (!isContinue) {
                if (cnt != 1) {
                    answer.append(str.charAt(i));
                    answer.append(cnt);
                }
                if (cnt == 1) {
                    answer.append(str.charAt(i));
                }
                cnt = 1;
            }
        }

        System.out.println(answer.toString());
    }

    /**
     * 뒤에 빈문자 추가 하는 방법
     *
     * @param str
     */
    private static void solution2(String str) {
        str += " ";
        StringBuilder answer = new StringBuilder();
        int cnt = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            boolean isContinue = str.charAt(i) == str.charAt(i + 1);
            if (isContinue) {
                cnt++;
            }
            if (!isContinue) {
                if (cnt != 1) {
                    answer.append(str.charAt(i));
                    answer.append(cnt);
                }
                if (cnt == 1) {
                    answer.append(str.charAt(i));
                }
                cnt = 1;
            }
        }

        System.out.println(answer.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        solution2(str);
    }
}

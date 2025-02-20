package algo_3_HashMap_TreeSet.algo_1_학급회장;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
    private static void solution(String vote) {
        HashMap<Character, Integer> result = new HashMap<>();
        for (char v : vote.toCharArray()) {
            result.put(v, result.getOrDefault(v, 0) + 1);
        }

        System.out.println(
                result.entrySet()
                        .stream()
                        .max(Comparator.comparingInt(Entry::getValue))
                        .map(Entry::getKey)
                        .get());

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String vote = sc.next();
        solution(vote);
    }
}

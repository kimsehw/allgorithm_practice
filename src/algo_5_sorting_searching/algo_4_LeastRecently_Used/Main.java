package algo_5_sorting_searching.algo_4_LeastRecently_Used;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static void solution(int[] todos, List<Integer> cache, int s) {
        for (int todo : todos) {
            if (!cache.contains(todo)) {
                if (cache.size() == s) {
                    cache.remove(s - 1);
                }
                cache.add(0, todo);
            } else {
                int idx = cache.indexOf(todo);
                for (int i = idx; i > 0; i--) {
                    Integer tmp = cache.get(i);
                    cache.remove(i);
                    cache.add(i, cache.get(i - 1));
                    cache.remove(i - 1);
                    cache.add(i - 1, tmp);
                }
            }
        }

        for (Integer integer : cache) {
            System.out.print(integer + " ");
        }
    }

    private static void solution(int[] todos, int[] cache, int s) {
        for (int todo : todos) {
            int idx = getHitIndex(cache, todo);
            if (idx == -1) {
                int add = todo;
                for (int i = 0; i < s; i++) {
                    if (cache[i] != 0) {
                        int nextAdd = cache[i];
                        cache[i] = add;
                        add = nextAdd;
                        continue;
                    }
                    cache[i] = add;
                }
            } else {
                for (int i = idx; i > 0; i--) {
                    int tmp = cache[i];
                    cache[i] = cache[i - 1];
                    cache[i - 1] = tmp;
                }
            }
        }

        for (int c : cache) {
            System.out.print(c + " ");
        }
    }

    private static void solution2(int[] todos, int[] cache, int s) {
        for (int todo : todos) {
            int idx = getHitIndex(cache, todo);
            if (idx == -1) {
                idx = s - 1;
            }
            for (int i = idx; i > 0; i--) {
                int tmp = cache[i];
                cache[i] = cache[i - 1];
                cache[i - 1] = tmp;
            }
            cache[0] = todo;
        }

        for (int c : cache) {
            System.out.print(c + " ");
        }
    }

    private static int getHitIndex(int[] cache, int todo) {
        for (int i = 0; i < cache.length; i++) {
            if (cache[i] == todo) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        List<Integer> cache = new ArrayList<>();
        int[] todos = new int[n];
        int[] ca = new int[s];
        for (int i = 0; i < n; i++) {
            todos[i] = sc.nextInt();
        }
        solution2(todos, ca, s);
    }
}

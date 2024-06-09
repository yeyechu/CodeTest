package algorithms;

import java.util.ArrayList;
import java.util.List;

public class ArrayListJava {

    public static void measure(long s, long e) {
        System.out.println(e - s + "ms");
    }
    private static final int times = 100000000;

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < times; i++)
            list.add(1);
        list.add(2);
        measure(startTime, System.currentTimeMillis());

        startTime = System.currentTimeMillis();
        list.contains(2);
        measure(startTime, System.currentTimeMillis());

        // ─────────────────────────────────────────────
        List<Integer> list2 = new ArrayList<>(times);
        startTime = System.currentTimeMillis();
        for (int i = 0; i < times; i++)
            list2.add(1);
        list2.add(2);
        measure(startTime, System.currentTimeMillis());

        startTime = System.currentTimeMillis();
        list2.contains(2);
        measure(startTime, System.currentTimeMillis());
    }
}

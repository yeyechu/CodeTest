package algorithms;

public class DataTypeForJava {
    private static final int times = 100000000;

    public static void measure(long s, long e) {
        System.out.println(e - s + "ms");
    }
    public static void main(String[] args) {

        int[] intElements = new int[times];

        // 삽입
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < times - 1; i++)
            intElements[i] = 1;
        intElements[times - 1] = 2;
        measure(startTime, System.currentTimeMillis());


        // 찾기
        int index = 0;
        startTime = System.currentTimeMillis();

        while (2 != intElements[index])
            index++;
        measure(startTime, System.currentTimeMillis());

        // ───────────────────────────────────────────
        Integer[] integerElements = new Integer[times];

        // 삽입
        startTime = System.currentTimeMillis();

        for (int i = 0; i < times - 1; i++)
            integerElements[i] = 1;
        integerElements[times - 1] = 2;
        measure(startTime, System.currentTimeMillis());

        // 찾기
        index = 0;
        startTime = System.currentTimeMillis();

        while (2 != integerElements[index])
            index++;
        measure(startTime, System.currentTimeMillis());
    }
}

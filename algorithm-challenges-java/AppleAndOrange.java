public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {

    int m = 0, n = 0;

    for (int i = 0; i < apples.size(); i++) {
        apples.set(i, apples.get(i) + a);

        if (apples.get(i) >= s && apples.get(i) <= t)
            m++;
    }

    for (int i = 0; i < oranges.size(); i++) {
        oranges.set(i, oranges.get(i) + b);

        if (oranges.get(i) >= s && oranges.get(i) <= t)
            n++;
    }
    System.out.println(m);
    System.out.println(n);
}
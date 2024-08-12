public static String kangaroo(int x1, int v1, int x2, int v2) {

    for (int i = 1; i <= 10000; i++) {
        int k1 = x1 + (v1 * i);
        int k2 = x2 + (v2 * i);
        if (k1 == k2) {
            return "YES";
        }
    }
    return "NO";
}
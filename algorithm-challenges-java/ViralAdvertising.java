public static int viralAdvertising(int n) {
    int cumulative = 0;
    int shared = 5;

    for (int i = 1; i <= n; i++) {
        int liked = shared / 2;
        shared = liked * 3;
        cumulative += liked;
    }
    return cumulative;
}
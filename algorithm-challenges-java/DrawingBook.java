public static int pageCount(int n, int p) {
    int result;

    if (n / 2 >= p) {
        result = p / 2;
        return result;
    }
    else {
        result = (((n % 2 == 0) ? ++n : n) - p) / 2;
        return result;
    }
}
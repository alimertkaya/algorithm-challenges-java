public static boolean isFactorOfAll(int num, List<Integer> arr) {
    // if 'num' is divisible by all elements in 'arr'
    for (int i : arr) {
        if (num % i != 0)
            return false;
    }
    return true;
}

public static boolean isMultipleOfAll(int num, List<Integer> arr) {
    // if 'num' is a divisor of all elements in 'arr'
    for (int i : arr) {
        if (i % num != 0)
            return false;
    }
    return true;
}

public static int getTotalX(List<Integer> a, List<Integer> b) {
    int count = 0;
    int max = Collections.max(a);
    int min = Collections.min(b);

    for (int i = max; i <= min; i++) {
        if (isFactorOfAll(i, a) && isMultipleOfAll(i, b))
            count++;
    }
    return count;
}
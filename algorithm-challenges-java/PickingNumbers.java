public static int pickingNumbers(List<Integer> a) {
    Collections.sort(a);
    int count = 0;
    int curVal = 0;

    for (int i = 0; i < a.size(); i++) {
        if (a.get(i) - a.get(curVal) <= 1)
            count = Math.max(count, i - curVal + 1);
        else
            curVal++;
    }
    return count;
}
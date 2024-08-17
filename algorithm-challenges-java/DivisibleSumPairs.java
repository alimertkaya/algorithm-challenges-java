public static int divisibleSumPairs(int n, int k, List<Integer> ar) {

    int count = 0,sum = 0;
    Collections.sort(ar);
    for (int i = 0; i < ar.size(); i++) {
        for (int j = i + 1; j < ar.size(); j++) {
            sum = ar.get(i) + ar.get(j);
            if (sum % k == 0 && i < j)
                count++;

            sum = 0;
        }
    }
    return count;
}
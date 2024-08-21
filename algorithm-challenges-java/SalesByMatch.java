public static int sockMerchant(int n, List<Integer> ar) {
    int temp = 0, count = 0;

    for (int i = 0; i < ar.size(); i++) {
        temp = ar.get(i);
        for (int j = i + 1; j < ar.size(); j++) {
            if (temp == ar.get(j)) {
                count++;
                ar.remove(j);
                break;
            }
        }
    }
    return count;
}
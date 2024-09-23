static int getMoneySpent(int[] keyboards, int[] drives, int b) {
    int result = -1;

    for (int keyboard : keyboards) {
        for (int drive : drives) {
            int sum = keyboard + drive;

            if (sum <= b && sum > result)
                result = sum;
        }
    }
    return result;
}
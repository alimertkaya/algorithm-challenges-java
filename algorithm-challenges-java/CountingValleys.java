public static int countingValleys(int steps, String path) {

    int count = 0;
    int valley = 0;

    for (char step : path.toCharArray()) {
        if (step == 'U')
            count++;
        else if (step == 'D')
            count--;

        if (count == 0 && step == 'U')
            valley++;
    }
    return valley;
}
// Solution 1
public static int jumpingOnClouds(List<Integer> c) {
    int min = 0, i = 0;
    while (i < c.size() - 1) {
        if (i + 2 < c.size() && c.get(i + 2) == 0)
            i += 2;
        else
            i++;
        min++;
    }
    return min;
}

// Solution 2
public static int jumpingOnClouds(List<Integer> c) {
    int min = 0, i = 0;
    while (i < c.size() - 1) {
        i += (i + 2 < c.size() && c.get(i + 2) == 0) ? 2 : 1;
        min++;
    }
    return min;
}

public static int migratoryBirds(List<Integer> arr) {

    int[] count = new int[6];
    int max = 0, number = -1;

    for (int i = 0; i < arr.size(); i++) {
        count[arr.get(i)]+= 1;
    }
    for (int i = 1; i < 6; i++) {
        if (count[i] > max) {
            max = count[i];
            number = i;
        }
    }
    return number;
}
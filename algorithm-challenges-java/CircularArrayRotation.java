public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
    int size = a.size();
    int[] rotated = new int[size];

    for (int i = 0; i < size; i++) {
        rotated[(i + k) % size] = a.get(i);
    }

    List<Integer> result = new ArrayList<>();
    for (int q : queries) {
        result.add(rotated[q]);
    }
    return result;
}
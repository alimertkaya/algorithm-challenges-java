public static int minimumDistances(List<Integer> a) {
    Map<Integer, Integer> map = new HashMap<>();
    int min = Integer.MAX_VALUE;

    for (int i = 0; i < a.size(); i++) {
        if (map.containsKey(a.get(i))) {
            int preIndex = map.get(a.get(i));
            int dis = i - preIndex;
            min = Math.min(min, dis);
        }
        map.put(a.get(i), i);
    }
    return (min == Integer.MAX_VALUE) ? -1 : min;
}

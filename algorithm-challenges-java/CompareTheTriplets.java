public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        /*
        List<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(0);
        */
    List<Integer> result = new ArrayList<>(Arrays.asList(0,0));

    for (int i=0; i<3; i++) {
        if (a.get(i) > b.get(i))
            result.set(0, result.get(0) + 1);
        else if (a.get(i) < b.get(i))
            result.set(1, result.get(1) + 1);
    }
    return result;
}
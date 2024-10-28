public static List<Integer> permutationEquation(List<Integer> p) {
    List<Integer> result = new ArrayList<>();

    for (int i = 1; i <= p.size(); i++) {
        result.add(p.indexOf(p.indexOf(i) + 1) + 1);
    }
    return result;
}
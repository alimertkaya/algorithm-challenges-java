public static String angryProfessor(int k, List<Integer> a) {
    int numberOfStudentsPresent = 0;
    Collections.sort(a);

    for (int i = 0; i < a.size(); i++) {
        if (a.get(i) <= 0)
            numberOfStudentsPresent++;
    }

    return (numberOfStudentsPresent >= k) ? "NO" : "YES";
}
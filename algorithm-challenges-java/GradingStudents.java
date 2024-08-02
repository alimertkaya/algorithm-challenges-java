public static List<Integer> gradingStudents(List<Integer> grades) {

    List<Integer> finalGrade = new ArrayList<>();

    for (int grade : grades) {
        int roundedGrade = grade + (5 - (grade % 5));

        if (grade < 38) {
            finalGrade.add(grade);
        } else {
            if (roundedGrade - grade < 3)
                finalGrade.add(roundedGrade);
            else
                finalGrade.add(grade);
        }
    }
    return finalGrade;
}
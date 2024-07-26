public static int diagonalDifference(List<List<Integer>> arr) {

    int length = arr.size();
    int sumFirstDiagonal = 0;
    int sumSecondDiagonal = 0;

    for (int i = 0; i < length; i++) {
        sumFirstDiagonal += arr.get(i).get(i);
        sumSecondDiagonal += arr.get(i).get((length - 1) - i);
    }
    int result = Math.abs((sumFirstDiagonal - sumSecondDiagonal));
    return result;
}
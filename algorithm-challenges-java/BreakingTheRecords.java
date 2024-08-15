public static List<Integer> breakingRecords(List<Integer> scores) {
    
    int min, max, minNum = 0, maxNum = 0, score = 0;
    List<Integer> counts = new ArrayList<>();
    min = scores.get(0);
    max = scores.get(0);

    for (int i = 1; i < scores.size(); i++) {
        score = scores.get(i);
        if (score < min) {
            min = scores.get(i);
            minNum++;
        }
        else if (score > max) {
            max = scores.get(i);
            maxNum++;
        }
    }
    counts.add(maxNum);
    counts.add(minNum);
    return counts;
}
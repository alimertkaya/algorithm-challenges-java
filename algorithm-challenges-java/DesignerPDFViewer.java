public static int designerPdfViewer(List<Integer> h, String word) {
    char[] letters = word.toCharArray();
    int maxHeight = 0;

    for (char c : letters) {
        int index = c - 'a';
        if (h.get(index) > maxHeight)
            maxHeight = h.get(index);
    }
    return maxHeight * word.length();
}
}
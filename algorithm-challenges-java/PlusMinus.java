public static void plusMinus(List<Integer> arr) {

    int zero = 0;
    int negative = 0;
    int positive = 0;
    int length = arr.size();

    for (int i = 0; i < length; i++) {
        int num = arr.get(i);
        if (num > 0)
            positive++;
        else if (num < 0)
            negative++;
        else
            zero++;
    }

    System.out.printf("%6f\n",(float) (positive / (float) length));
    System.out.printf("%6f\n",(float) (negative / (float) length));
    System.out.printf("%6f",(float) (zero / (float) length));
}
}
public static int birthdayCakeCandles(List<Integer> candles) {

    int tallestCandle = 0;
    int temp = candles.get(0);
    for (int i = 0; i < candles.size(); i++) {
        if (candles.get(i) >= temp) {
            if (temp == candles.get(i))
                tallestCandle++;
            else
                tallestCandle = 1;
            temp = candles.get(i);
        }
    }
    return tallestCandle;

}
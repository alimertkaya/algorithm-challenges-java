public static int beautifulDays(int i, int j, int k) {
    int beautifulDay = 0;

    for (int num = i; num <= j; num++) {
        int revNum = reverseNumber(num);
        if ((num - revNum) % k == 0)
            beautifulDay++;
    }
    return beautifulDay;
}

public static int reverseNumber(int num) {
    int rev = 0;

    while (num != 0) {
        int rem = num % 10;
        rev = rev * 10 + rem;
        num = num / 10;
    }
    return rev;
}
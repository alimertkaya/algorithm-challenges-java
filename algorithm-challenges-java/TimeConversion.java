public static String timeConversion(String s) {

    String period = s.substring(s.length() - 2);
    int hour = Integer.parseInt(s.substring(0,2));
    String minute = s.substring(3,5);
    String second = s.substring(6,8);

    if (period.equals("AM")) {
        if (hour == 12)
            hour = 0;
    } else {
        if (hour != 12)
            hour += 12;
    }
    String newHour = String.format("%02d",hour);
    String newTime = newHour + ":" + minute + ":" + second;
    return newTime;
}
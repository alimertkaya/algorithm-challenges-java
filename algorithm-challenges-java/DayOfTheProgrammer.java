public static String dayOfProgrammer(int year) {

    boolean isJulianLeap = (year < 1918) && (year % 4 == 0);
    boolean isGregorianLeap = (year > 1918) && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));

    if (year == 1918)
        return "26.09.1918";
    else if (isJulianLeap || isGregorianLeap)
        return "12.09." + year;
    else
        return "13.09." + year;

}

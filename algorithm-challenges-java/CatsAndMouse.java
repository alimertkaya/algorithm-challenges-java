static String catAndMouse(int x, int y, int z) {
    int catADistance = Math.abs(x - z);
    int catBDistance = Math.abs(y - z);
    String result;

    if (catADistance < catBDistance)
        result = "Cat A";
    else if (catADistance > catBDistance)
        result = "Cat B";
    else
        result = "Mouse C";

    return result;
}
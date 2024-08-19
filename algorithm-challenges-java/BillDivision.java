public static void bonAppetit(List<Integer> bill, int k, int b) {
    int sum = 0, bActual = 0;
    bill.remove(k);

    for (int i = 0; i < bill.size(); i++) {
        sum += bill.get(i);
    }
    bActual = sum / 2;

    if (bActual == b)
        System.out.println("Bon Appetit");
    else
        System.out.println(b - bActual);
}
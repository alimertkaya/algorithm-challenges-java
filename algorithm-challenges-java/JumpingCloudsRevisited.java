static int jumpingOnClouds(int[] c, int k) {
    int energy = 100;
    int index = 0;

    do {
        index = (index + k) % c.length;
        energy -= 1;

        if (c[index] == 1)
            energy -= 2;

    } while (index != 0);
    return energy;
}

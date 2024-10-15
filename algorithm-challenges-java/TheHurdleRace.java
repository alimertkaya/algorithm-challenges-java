import java.util.Collections;
import java.util.List;

public static int hurdleRace(int k, List<Integer> height) {

    int maxHeight;

    // Collections
    Collections.sort(height);
    maxHeight = height.get(height.size()- 1);

    // for loop
    /*
    maxHeight = height.get(0);
    for (int i = 1; i < height.size(); i++) {
        if (height.get(i) > maxHeight)
            maxHeight = height.get(i);
    } */

    if (k > maxHeight)
        return 0;
    else
        return maxHeight - k;
}
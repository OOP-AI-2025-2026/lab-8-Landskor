package ua.opnu;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class FilterUtils {

    public static <T> T[] filter(T[] input, Predicate<T> p) {
        List<T> resultList = new ArrayList<>();
        for (T element : input) {
            if (p.test(element)) {
                resultList.add(element);
            }
        }
        return resultList.toArray(Arrays.copyOf(input, 0));
    }
}
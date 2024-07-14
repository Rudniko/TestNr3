package pl.kurs.zad4;


import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MinMaxService {

    public static <T extends Comparable<T>> MinMax<T> getMinAndMax(List<T> elements) {
        T min = Collections.min(elements);
        T max = Collections.max(elements);
        return new MinMax<>(min, max);
    }
}

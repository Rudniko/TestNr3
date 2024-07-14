package pl.kurs.zad4;

public class MinMax<T extends Comparable<T>> {
    private T max;
    private T min;

    public MinMax(T max, T min) {
        this.max = max;
        this.min = min;
    }

    public T getMin() {
        return min;
    }

    public T getMax() {
        return max;
    }

    @Override
    public String toString() {
        return "MinMax{" +
                "max= " + max +
                ", min= " + min +
                '}';
    }
}

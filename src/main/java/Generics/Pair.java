package Generics;

public class Pair<T extends Number> {
    private T first;
    private T second;
    public Pair(T first,T second)
    {
        this.first=first;
        this.second=second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
    public double sum()
    {
        return first.doubleValue()+second.doubleValue();
    }
}
